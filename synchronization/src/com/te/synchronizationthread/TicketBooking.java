package com.te.synchronizationthread;

public class TicketBooking {
	int tickets=20;
	
	public void bookTickets(int noOfTickets,String name) {
		System.out.println("login successful");
		System.out.println("Welcome to IRCTC");
		System.out.println("Hello"+name);
		synchronized (this) {
			if(tickets<noOfTickets) {
			System.out.println("Tickets are unavailable");
		}else {
			System.out.println(noOfTickets+" tickets are booked:");
			tickets-=noOfTickets;
		}
		System.out.println("no of tickets booked"+ tickets);
	}
	
	System.out.println("Thank you ! wear mask,happy journey");
	System.out.println("Thank you ! wear mask,happy journey");
}
}

