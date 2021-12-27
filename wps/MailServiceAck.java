package com.onlineslot.getslots;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailServiceAck {

	
	public  void sendSimpleMessage(
			 String to,String subject) throws Exception {
		String text="Dear customer,          Your booking was successful and please enter the store with an OTP sent to you prior to your slot time.            Happy to help :)";
		 
		 
		 Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication("balabhinavreddy@gmail.com", "balabhinav");
		      }
		   });
		   Message msg = new MimeMessage(session);
		   msg.setFrom(new InternetAddress("balabhinavreddy@gmail.com", false));

		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		   msg.setSubject("Slot for the "+subject);
		   msg.setContent(text, "text/html");
		   msg.setSentDate(new Date());

		   MimeBodyPart messageBodyPart = new MimeBodyPart();
		   messageBodyPart.setContent(text, "text/html");

		   Multipart multipart = new MimeMultipart();
		   multipart.addBodyPart(messageBodyPart);
		   msg.setContent(multipart);
		   MimeBodyPart attachPart = new MimeBodyPart();
		   //BufferedImage bi=QrCodeGenerator.generateQRCodeImage(slotid+" "+otp+" "+duration);
		   //File f1=new File("C://Users/ramir/Pictures/Saved Pictures/drones.jpeg");
		   //ImageIO.write(bi,"png",f1);
		   //attachPart.attachFile("C://Users/ramir/Pictures/Saved Pictures/drones.jpeg");
		   //multipart.addBodyPart(attachPart);
		   
		   Transport.send(msg); 
		    }
	
}
