package com.sakha.springproject.SpringProject1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	
	@Autowired
	@Qualifier("airtel")
	Sim sim;
	
	public Mobile() {
		System.out.println("Defalt constructor of Mobile");
	}
	
	public Mobile(Sim sim) {
		super();
		this.sim = sim;
	}

	public void makeAcall() {
		sim.call();
	}
	public void sendSms()
	{
		sim.sendSms();
	}
	public void browse()
	{
		sim.browse();
	}
	
	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public void sendMms()
	{
		sim.sendMms();
	}
	
	public void supNetwork()
	{
		sim.supportNetworks();
	}
	public void showSupportedNetworks()
	{
		sim.showSupportedNetworks();
	}
	
}
