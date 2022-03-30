import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*--------------INFO--------------------
		Author: D Kalsi (909298)
----------------------------------------*/

public class Table {
	
	private static ArrayList<Table> tables = new ArrayList<Table>();
	private int tableNum;
	private int numSeats;
	private boolean available;
	private ArrayList<Booking> booking;
	private static File allTables = new File("tableList.txt");
	
		
	public Table (int num, int seats) {
		tableNum = num;
		numSeats = seats;
		available = true;
		booking = new ArrayList<Booking>();
	}
	
	public String toString() {
		return "\nTable: " + tableNum + "\nSeats: " + numSeats + "\nAvailable: " + available;
	}
		
	//Returns the availability of the table (whether or not it has been assigned a booking)
	public boolean getAvailability() {
		return available;
	}
	
	//Prints all tables
	public static void printTables() {
		for (Table table: tables) {
			System.out.print(table + "\n");						
		}
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
	
	// Reads and inputs table objects from text file to table ArrayList
	public static void readFile() throws FileNotFoundException{
		Scanner scan = new Scanner(allTables);
		
		while (scan.hasNextLine()) {
			
			try {
				String[] info = scan.nextLine().split(", ");
				tables.add(new Table(Integer.parseInt(info[0]), Integer.parseInt(info[1])));
			} 
			catch (Exception e) {
				System.out.println("Error bruv...");
			}
			
		}
	}

}