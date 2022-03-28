import java.util.ArrayList;

public class Table {
	
	private int tableNum;
	private int numSeats;
	private boolean available;
	private ArrayList<Booking> booking;
	
	public Table (int num, int seats) {
		tableNum = num;
		numSeats = seats;
		available = true;
		booking = new ArrayList<Booking>();
	}
	
	public String toString() {
		return "Table number: " + tableNum + "\nSeats: " + numSeats + "\nAvailable: " + available;
	}
	
	//Returns the availability of the table (whether or not it has been assigned a booking)
	public boolean getAvailability() {
		return available;
	}
	
	//Prints the booking assigned to the table
	public void getBooking() {
		for (Booking bookings: booking) {
			System.out.println(bookings);						
		}
	}
	
	//Sets the booking to the table while also checking whether it already contains a booking or not
	public void setBooking(Booking booked) {
		if (booking.size() < 1) {
			booking.add(booked);
			available = false;
		}
		System.out.println("This table is already booked");
	}

	//Removes the booking assigned to the table while also checking whether it already contains a booking or not
	public void removeBooking(Booking cancel) {
		if (booking.size() > 1) {
			booking.remove(cancel);
			available = true;
		}
		System.out.println("This table is not booked");
	}

}