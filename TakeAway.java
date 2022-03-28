import java.util.ArrayList;
import java.util.Scanner;

/*--------------INFO--------------------
		Author: 
		Updated by: D Connolly (2128770)
----------------------------------------*/

class TakeAway {
	private static ArrayList<TakeAway> takeAways = new ArrayList<>();
	private static Customer customerID;
	private static String collectTime;
	private static String takeAwayID;
	private static int num = 0;
	private static ArrayList<String> items = new ArrayList<>();
	
	
    public TakeAway(Customer c) {
      this.customerID = c;
	  this.takeAwayID = "TAKE_" + num;
	  
	  num++;
    }
	

	public static void setCustomer(Customer c) {
		customerID = c;
	}
	
	public static void setDateTime(String time) {
		collectTime = time;
	}
	
	public static void addItem(String item) {
		items.add(item);
	}
	
	public static String getItem(int i) {
		return items.get(i);
	}
	
	public static String getItems() {
		return items.toString();
	}
	
	public static void addTakeAway(TakeAway t) {
        takeAways.add(t);
    }
	
    public static void removeTakeAway(int i) {
        takeAways.remove(i);
    }
	
	public static String getID() {
		return takeAwayID;
	}
	
	public static void getAllItems() {
		for(int i = 0; i < takeAways.size();i++) {
			System.out.println("Order ID: " + takeAways.get(i).getID());
			System.out.println("ITEMS: " + takeAways.get(i).getItems());
		}
	}
}
