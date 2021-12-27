package com.onlineslot.getslots;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.onlineslot.respositories.CustomerRepo;
import com.onlineslot.respositories.SlotRepository;

@EnableAsync
@Component
public class SlotRemoval {

	@Autowired
	private SlotRepository srepo;
	@Autowired
	 private CustomerRepo customerrepo;
	@Async
	 @Scheduled(cron = "5 * * * * ?")
	   public void fixedRateSch() {
		 SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

	      Date now = new Date();
	      String strDate = sdf.format(now);
	      System.out.println("Fixed Rate scheduler:: " + strDate);
	      List<Slot> slots=srepo.findByTime(strDate);
	     
	      int size =slots.size();
	      for(Slot slot: slots) {
	    	  System.out.println(slot.getTime());
	    	  System.out.println(slot.getUserid());
	    	  Customer c=customerrepo.findByCustomerid(slot.getUserid());
		      System.out.println(c.getEmail());
	    	  //Optional<Customer> c=customerrepo.findById(slot.getUserid());
	    	  //Customer c1=c.get();
	    	  //System.out.println(c1.getUsername());
	    	  try {
	    		  MailService m=new MailService();
				m.sendSimpleMessage(c.getEmail(),slot.getName(),slot.getOtp(),slot.getId(),slot.getTime(),slot.getDuration());
				srepo.deleteById(slot.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
}
}
