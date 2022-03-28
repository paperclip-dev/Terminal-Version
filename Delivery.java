import java.util.ArrayList;
import java.util.Scanner;
/*--------------INFO--------------------
		This class represent a delivery Order
 
		Author: Femi Alogba ()
		updated: by D Connolly (2128770)
----------------------------------------*/
class Delivery{
	private static ArrayList<Delivery> deliveries = new ArrayList<>();
    private static Driver driverID;
    private int deliverTime;
    private boolean approved;
    private static Customer customerID;
	private static String deliveryID;
	private static ArrayList<String> items = new ArrayList<>();
	private static int num = 0;
	private static String status = "Pending";
	
    //delivery constructor
    public Delivery(Customer cID){
        this.customerID = cID;
		this.deliveryID = "DELIVER_" + num;
		num++;
		for(int i = 0; i < Driver.getDriversSize();i++) {
			this.driverID = Driver.getDriver(i);
		}
			
    }
	
    // assign a driver to delivery
    public void assignDriver(Driver driverID){
        this.driverID = driverID;
        System.out.println("Your order has been dispatched");
    }
	
	public static void setCustomer(Customer c) {
		customerID = c;
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
	
	public static void addDelivery(Delivery d) {
		deliveries.add(d);
	}
	
    public static void removeDelivery(int i) {
        deliveries.remove(i);
    }
	
	public static String getID() {
		return deliveryID;
	}
	public static Delivery getDelivery(int i) {
		return deliveries.get(i);
	}
	public static void printItems() {
		System.out.println(items.toString());
	}
	
	public static Driver getDriver() {
		return driverID;
	}
	
	public static String getStatus() {
		return status;
	}
	
	public static void setStatus() {
		status = "Complete";
	}
	
	// this will print all deliveries (ID + items)
	public static void getAllItems() {
		for(int i = 0; i < deliveries.size();i++) {
			System.out.println("Order ID: " + deliveries.get(i).getID());
			System.out.println("ITEMS: " + deliveries.get(i).getItems());
		}
	}
	
	//this will take in a driver number and return a print of all the deliveries that driver is required to deliver.
	public static void driverDeliveries(int d) {
		for(int i = 0; i < deliveries.size(); i++) {
			if(deliveries.get(i).getDriver() == Driver.getDriver(d)) {
				System.out.println(deliveries.get(i).getID() + "\tStatus: " + deliveries.get(i).getStatus());
			}
		}
	}
}