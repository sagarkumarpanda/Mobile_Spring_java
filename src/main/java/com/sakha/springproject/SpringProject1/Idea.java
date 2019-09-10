package com.sakha.springproject.SpringProject1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Idea implements Sim{

	int phoneNo;
	int internetSpeed;
	float callCharge;
	float smsCharge;
	float MmsCharge;
	List<String> list =new ArrayList();
	
	
	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Idea() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Idea(int phoneNo, int internetSpeed, float callCharge, float smsCharge, float mmsCharge, List<String> list) {
		super();
		this.phoneNo = phoneNo;
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
		this.smsCharge = smsCharge;
		MmsCharge = mmsCharge;
		this.list = list;
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

	public float getSmsCharge() {
		return smsCharge;
	}

	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("Browsing from Idea charges " + internetSpeed +"/hour");
		
	}

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Idea charges "+ callCharge + "/min");
	}

	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("Sending Sms from Idea charges "+ smsCharge + "/1msg\"");
	}

	public void sendMms() {
		System.out.println("Sending Mms from Idea charges "+ MmsCharge + "/1msg\"");
		
	}

	public void supportNetworks() {
		// TODO Auto-generated method stub
		
	}

	public void showSupportedNetworks() {
		// TODO Auto-generated method stub
		
	}

}