package com.sakha.springproject.SpringProject1;
import org.springframework.stereotype.Component;

@Component
public interface Sim {

	public void browse();
	public void call();
	public void sendSms();
	public void sendMms();
	public void supportNetworks(); 
	public void setCallCharge(float callcharge);
	public void showSupportedNetworks();
}
