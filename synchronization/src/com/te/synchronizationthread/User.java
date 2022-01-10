package com.te.synchronizationthread;

public class User extends Thread {
    TicketBooking booking;
	int noOfTickets;
	
	
	public User(TicketBooking booking, int noOfTickets, String name) {
		super();
		this.booking = booking;
		this.noOfTickets = noOfTickets;
		this.name = name;
	}
	String name;
	@Override
	public void run() {
		booking.bookTickets(noOfTickets,name);
	}

}
