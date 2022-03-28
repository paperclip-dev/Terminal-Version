import java.util.ArrayList;
import java.util.Scanner;

/*--------------INFO--------------------
 * This class represent an Eat-in Order.
		Author: Femi Alogba
----------------------------------------*/

class EatIn {
	private static ArrayList<EatIn> eatIns = new ArrayList<>();
    private static Waiter waiterID;
	private static Customer customerID;
	private static String dateTime;
	private static String eatID;
	private static int num = 0;
	private static ArrayList<String> items = new ArrayList<>();
	private static Table tableID;
	
	
	
    public EatIn(String waiterID) {
	  this.eatID = "EAT" + num;
	  num++;
    }
	
	public static String getEatID() {
		return eatID;
	}
	
    public void setTable(Table tableID) {
        this.tableID = tableID;
    }
    
	public void setWaiter(Waiter waiterID) {
		this.waiterID = waiterID;
	}
	
	public void setCustomer(Customer customerID) {
		this.customerID = customerID;
	}
	
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	public static void addItem(String item) {
		items.add(item);
	}
	
	public String getItem(int i) {
		return items.get(i);
	}
	
	public static String getItems() {	
		return items.toString();
	}
	
    public void removeEatIn(int i) {
        this.eatIns.remove(i);
    }
	
	public static void addEatIn(EatIn e) {
		eatIns.add(e);
	}
	
	public static void getAllItems() {
		for(int i = 0; i < eatIns.size();i++) {
			System.out.println("Order ID: " + eatIns.get(i).getEatID());
			System.out.println("ITEMS: " + eatIns.get(i).getItems());
		}
	}
	
}