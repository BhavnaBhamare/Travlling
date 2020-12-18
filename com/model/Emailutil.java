package com.model;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Emailutil 
{
	public static void sendEmail1(String host, String port, final String user,final String pass, String email1, String oTP) throws MessagingException 
	{
		
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, pass);
			}
		};

		Session session = Session.getInstance(properties, auth);

		Message msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress(user));
		InternetAddress[] toAddresses = { new InternetAddress(email1) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
 		msg.setSubject("OTP Generate : ");
	    msg.setText(oTP);
	   
		Transport.send(msg);
		
	}

	public static void sendEmail2(String host, String port, String user, String pass, String email1, String msg1) throws AddressException, MessagingException 
	{
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, pass);
			}
		};

		Session session = Session.getInstance(properties, auth);

		Message msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress(user));
		InternetAddress[] toAddresses = { new InternetAddress(email1) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
 		msg.setSubject("Hi : ");
	    msg.setText(msg1);
	   
		Transport.send(msg);
		
	}

}
