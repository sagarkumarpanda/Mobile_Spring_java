package com.sakha.springproject.SpringProject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{

	
	public Airtel() {
		// TODO Auto-generated constructor stub
	}
	
	
	int phoneNo;
	@Value("${internetSpeed}")
	int internetSpeed;

	@Value("${callCharge}")
	float callCharge;
	
	@Value("${list}")
	List<String> list =new ArrayList();
	
	@Value("#{${supportedNetworks}}")
	Map<String,Integer> supportedNetworks;
	
	
	public Map<String, Integer> getSupportedNetworks() {
		return supportedNetworks;
	}
	public void setSupportedNetworks(Map<String, Integer> supportedNetworks) {
		this.supportedNetworks = supportedNetworks;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(int internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

//	public float getSmsCharge() {
//		return smsCharge;
//	}
//
//	public void setSmsCharge(float smsCharge) {
//		this.smsCharge = smsCharge;
//	}

	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("Browsing from Airtel charges " + internetSpeed +"/hour");
		
	}

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Airtel charges "+ callCharge + "/min");
	}

	

	
	public Airtel(int phoneNo, int internetSpeed, float callCharge, List<String> list,
			Map<String, Integer> supportedNetworks, MessageSender msg) {
		super();
		this.phoneNo = phoneNo;
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
		this.list = list;
		this.supportedNetworks = supportedNetworks;
		this.msg = msg;
	}
	public MessageSender getMsg() {
		return msg;
	}

	public void setMsg(MessageSender msg) {
		this.msg = msg;
	}

	@Autowired
	
	MessageSender msg;
	
	public void sendSms()
	{
		msg.sendSms1();
	}

	public void sendMms() {
		msg.sendMms1();
	}
	public void supportNetworks() {
		System.out.println(list);
		
	}

public void showSupportedNetworks() {
	// TODO Auto-generated method stub
	System.out.println("Support netwoks are" + supportedNetworks);
	}
}