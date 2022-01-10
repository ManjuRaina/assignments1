package com.te.staticdefault;

public class Demo {

	public static void main(String[] args) {
		
		PhoneCall call=new Maharastra();
		PhoneCall call1=new TamilNadu();
		PhoneCall call2=new Karnataka();
		
		call.busyMessage();
		call1.busyMessage();
		call2.busyMessage();
		System.out.println("====================================");
		call.covidAlert();
		call1.covidAlert();
		call2.covidAlert();

	}

}
