package com.onlineslot.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineslot.getslots.Customer;
import com.onlineslot.getslots.FastSlots;
import com.onlineslot.getslots.MailService;
import com.onlineslot.getslots.Slot;
import com.onlineslot.respositories.CustomerRepo;
import com.onlineslot.respositories.FastSlotsRepository;
import com.onlineslot.respositories.SlotRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class Admin {
	@Autowired
	private SlotRepository srepo;
	@Autowired
	 private CustomerRepo customerrepo;
	@Autowired
	private FastSlotsRepository frepo;
	@GetMapping("admin")
	public List<Slot> fixedRateSch() {
	      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

	      Date now = new Date();
	      String strDate = sdf.format(now);
	      System.out.println("Fixed Rate scheduler:: " + strDate);
	      List<Slot> slots=srepo.findAll();
	      List<FastSlots> slots1=frepo.findAll();
	      //slots.addAll(slots1);
	      Customer c=customerrepo.findByCustomerid(252l);
	      System.out.println(c.getEmail());
	      int size =slots.size();
	      for(Slot slot: slots) {
	    	  System.out.println(slot.getTime());
	    	  System.out.println(slot.getUserid());
	    	  //Optional<Customer> c=customerrepo.findById(slot.getUserid());
	    	  //Customer c1=c.get();
	    	  //System.out.println(c1.getUsername());
	    	  
	      }
		return slots;
}
}
