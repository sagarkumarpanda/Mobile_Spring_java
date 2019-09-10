package com.sakha.springproject.SpringProject1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageSender{

	

	@Value("${smsCharge}")
	float smsCharge;
	

	@Value("${mmsCharge}")
	float mmsCharge;
	
	public void sendMms1() {
		System.out.println("Sending Mms");
	}
	public MessageSender() {
		// TODO Auto-generated constructor stub
	}

	public MessageSender(float smsCharge, float mmsCharge) {
		super();
		this.smsCharge = smsCharge;
		this.mmsCharge = mmsCharge;
	}

	public void sendSms1() {
		System.out.println("Sending Mms");
		
	}

	public float getSmsCharge() {
		return smsCharge;
	}

	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}

	public float getMmsCharge() {
		return mmsCharge;
	}

	public void setMmsCharge(float mmsCharge) {
		this.mmsCharge = mmsCharge;
	}

}
