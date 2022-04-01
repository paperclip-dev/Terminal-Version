import java.util.ArrayList;

/*--------------INFO--------------------
		Author: A Williams ()
		Updated by: D Connolly (2128770)
----------------------------------------*/

public class Manager extends User {
	private static String managerID;
	private static int count = 0;
	private static int hrsWorked = 0;
	private static ArrayList<Manager> managers = new ArrayList<Manager>();
	
	static {
		Manager man1 = new Manager("John", "Bull");
		managers.add(man1);
	}

	public Manager(String firstName, String lastName) {
		super(firstName, lastName);
		this.managerID = "M" + count;
		count++;
	}


	public static String getManagerID() {
		return managerID;
	}
	
	public static Manager getManager(int i) {
		return managers.get(i);
	}
	
	public static void addHrs(int i) {
		hrsWorked = hrsWorked + i;
	}
	
	public static void printAllManagers() {
		for(int i = 0; i < managers.size(); i++) {
			System.out.println(managers.get(i).getManagerID());
		}
	}
	
	public static void addManager(Manager m) {
		managers.add(m);
	}
	
	
	
		//code not required for terminal version:
	/*
	public void createChef(String firstName, String lastName) {
		Chef chef = new Chef(firstName, lastName);
		Chef.chefs.add(chef);
	}
	
	public void createWaiter(String firstName, String lastName) {
		Waiter waiter = new Waiter(firstName, lastName);
		Waiter.waiters.add(waiter);
	}
	
	public void createManager(String firstName, String lastName) {
		Manager manager = new Manager(firstName, lastName);
		Manager.managers.add(manager);
	}
	*/
}
