package com.sakha.springproject.SpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App 
{
    public App() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main( String[] args )
    {
    
    	
    //	Mobile m =new Mobile();
    	ApplicationContext context ;
    	context = new AnnotationConfigApplicationContext(Appconfig.class);
     //	context = new ClassPathXmlApplicationContext("Spring.xml");
     	Mobile m =context.getBean("mobile",Mobile.class);
     	
     	
     	
////     	Sim sim = context.getBean("airtel",Sim.class);
    // or 	Sim sim=(Sim) context.getBean("airtel");
    	
 //   	Sim sim =new Airtel();
    //	m.setSim(sim);
    	m.browse();
    	m.makeAcall();
    	m.sendSms();
    	m.getSim().setCallCharge(2.68f);
    	m.sendMms();
    	m.supNetwork();
    	m.showSupportedNetworks();
    	
    	Mobile m2 =context.getBean("mobile",Mobile.class);
    	m2.makeAcall();
    	
    }
}
