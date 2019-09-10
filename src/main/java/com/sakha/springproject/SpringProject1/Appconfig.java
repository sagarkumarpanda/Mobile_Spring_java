package com.sakha.springproject.SpringProject1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// @Configuration
@ComponentScan("com.sakha.springproject.SpringProject1")
@PropertySource("file.properties")
public class Appconfig {
	
	@Bean("ms")
	public MessageSender getMessageSenderBean()
	{
		
		MessageSender ms =new MessageSender();
		ms.setMmsCharge(5.4f);
		ms.setSmsCharge(3.4f);
		
		return ms;
	}

	
	@Bean("airtel")
	public Airtel getAirtelBean()
	{
		
		Airtel airtel = new Airtel();
		airtel.setCallCharge(5);
		airtel.setInternetSpeed(3);
		airtel.setPhoneNo(21321);
		airtel.setList(null);
		airtel.setSupportedNetworks(null);
		airtel.setMsg(getMessageSenderBean());
		
		return airtel;
		
	}
	
	
//	@Bean
//	public Idea getIdeaBean()
//	{
//		Idea idea =new Idea();
//		idea.setCallCharge(3);
//		idea.setInternetSpeed(6);
//		idea.setSmsCharge(2);
//		idea.setMsg(getMessageSenderBean());
//		
//		return idea;
//	}
	
	@Bean("mobile")
	public Mobile getMobileBean()
	{
		
		Mobile mobile =new Mobile();
		mobile.setSim(getAirtelBean());
		return mobile;
	}
	
	
}
