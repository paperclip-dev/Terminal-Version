import java.util.ArrayList;

/*--------------INFO--------------------
		Author: A Williams () 
		Updated by: D Connolly (2128770)
----------------------------------------*/

public class Chef extends User {
	private static String chefID;
	private static ArrayList<Chef> chefs = new ArrayList<>();
	private static int count = 0; //Used to generate unique ID.
	private static int hrsWorked = 0;
	
	static {
		Chef chef1 = new Chef("Test", "Chef");
		chefs.add(chef1);
	}
	
	
	//Constructor
	public Chef(String firstName, String lastName) {
		super(firstName, lastName);
		this.chefID = "F" + String.valueOf(Chef.count);
		Chef.count++;
	}
	
	public String getChefID(){
		return this.chefID;
	}
	
	public static Chef getChef(int c) {
		return chefs.get(c);
	}
	
	public static void printChef(int i) {
		System.out.println("Chef ID: " + chefs.get(i).chefID);
		System.out.println("First Name: " + chefs.get(i).getFirst());
		System.out.println("Last Name: " + chefs.get(i).getLast());
		System.out.println("Hours Worked: " + chefs.get(i).hrsWorked);
	}
	public static void addChef(Chef c) {
		chefs.add(c);
	}
	
	public static void printAllChefs() {
		for(int i = 0; i < chefs.size(); i++) {
			System.out.println(chefs.get(i).getChefID());
		}
	}
	
	public static void addHrs(int i) {
		hrsWorked = hrsWorked + i;
	}
	
	
	//public viewOrders() {
	//	
	//}
	
	//public addSpecials(Menu menu){
	// 
	//}
	
	//public void unavailable(Food foodItem) {
	// 
	//}
	
	//public void orderReady(Order order){
	//
	//}
}