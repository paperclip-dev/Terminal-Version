
import java.util.ArrayList;

/*--------------INFO--------------------
		Author: A Williams () 
		Updated by: D Connolly (2128770)
----------------------------------------*/

public class Driver extends User {
	private String driverID;
	private static ArrayList<Driver> drivers = new ArrayList<>();
	private static int num = 0;
	private static int hrsWorked = 0;
	private static String sched;

     // creates an example Driver
	static {
		Driver drive1 = new Driver("Test", "Driver", "mon, tues, wed");
		drivers.add(drive1);
	}
	 
	 
	 // the constructor
	public Driver(String firstName, String lastName, String sched) {
		super(firstName, lastName);
		this.sched = sched;
		this.driverID = "D" + num;
		num++;
	}

       
	public String getID() {
		return driverID;
	}
	
	public static Driver getDriver(int i) {
		return drivers.get(i);
	}
	
	public static int getHrsWorked() {
		return hrsWorked;
	}
	
	public static void addHrs(int i) {
		hrsWorked = hrsWorked + i;
	}
	
	public static String getSched() {
		return sched;
	}
    
	public static void printDriver(int i) {
		System.out.println("Driver ID: " + drivers.get(i).driverID);
		System.out.println("First Name: " + drivers.get(i).getFirst());
		System.out.println("Last Name: " + drivers.get(i).getLast());
		System.out.println("Work Hours: " + drivers.get(i).getHrsWorked());
		System.out.println("Schedule: " + drivers.get(i).getSched());
		
		
	}
	
	public static int getDriversSize(){
		return drivers.size();
	}
	
	public static void printAllDrivers() {
		for(int i = 0; i < drivers.size(); i++) {
			System.out.println(drivers.get(i).getID());
		}
	}
	
	/*
	public String toString(int i){
		return drivers.get(i).firstName + "|" + drivers.get(i).lastName + "|" + drivers.get(i).id
				+ "|" + drivers.get(i).sched + "|" + drivers.get(i).hrsWorked; 
	}
	*/
}