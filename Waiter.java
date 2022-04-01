
import java.util.ArrayList;

/*--------------INFO--------------------
		Author: A Williams ()
		Updated by: D Connolly (2128770)
----------------------------------------*/

public class Waiter extends User {
	private String waiterID;
	private static int hrsWorked = 0;
	static int count = 0;
	private static ArrayList<Waiter> waiters = new ArrayList<Waiter>();

	//example Waiter
	static {
		Waiter wait1 = new Waiter("Test", "Waiter");
		waiters.add(wait1);
	}
	
	public Waiter(String firstName, String lastName) {
		super(firstName, lastName);
		this.waiterID = "W" + String.valueOf(count);
		count++;
	}

	public String getWaiterID(){
		return waiterID;
	}
	
	
	public static Waiter getWaiter(int w) {
		return waiters.get(w);
	}
	
	public static void printWaiter(int i) {
		System.out.println("Waiter ID: " + waiters.get(i).waiterID);
		System.out.println("First Name: " + waiters.get(i).getFirst());
		System.out.println("Last Name: " + waiters.get(i).getLast());
		System.out.println("Hours Worked: " + waiters.get(i).hrsWorked);
	}
	
	public static void addWaiter(Waiter w) {
		waiters.add(w);
	}
	
	public static void printAllWaiters() {
		for(int i = 0; i < waiters.size(); i++) {
			System.out.println(waiters.get(i).getWaiterID());
		}
	}
	
	public static void addHrs(int i) {
		hrsWorked = hrsWorked + i;
	}
	
}