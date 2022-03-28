import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*--------------INFO--------------------
		Author: D Connolly (2128770)
----------------------------------------*/

public class Main {
	public static void main(String[] args) {
	
	
		int a;
		boolean run = true;
		boolean more = true;
		int count = 0;
		
		
		while(run == true) {
			System.out.println("--------------------------------");
			System.out.println("	Welcome to Cafe94!");
			System.out.println("--------------------------------");
			System.out.println("please select from the following options:");
			System.out.println("--MAIN MENU--:");
			System.out.println("1. Customer");
			System.out.println("2. Staff");
			System.out.println("3. Exit");
			
			
			Scanner scan = new Scanner(System.in);
			Scanner stscan = new Scanner(System.in);
			
			a = scan.nextInt();
			
			// The Customer System
			if(a == 1) {
				System.out.println("Are you an existing customer?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				a = scan.nextInt();
				if(a == 1) {
					System.out.println("please enter your customer number: ");
					int c = scan.nextInt();
					System.out.println("Are these details correct? ");
					Customer.printCustomer(c);
					System.out.println("1. Yes");
					System.out.println("2. No");
					a = scan.nextInt();
					if(a == 1) {
						System.out.println("please select from the following options:");
						System.out.println("1. Create Booking");
						System.out.println("2. Order for Collection");
						System.out.println("3. Order for Delivery");
						a = scan.nextInt();
						if(a == 1) {
							System.out.println("How many people is the booking for?");
							a = scan.nextInt();
							System.out.println("please enter when you would like the booking for: (format: dd/mm/yy)");
							String b = stscan.nextLine(); //string scan
							System.out.println("please enter what time you would like the booking for: (format: hh:mm)");
							String d = stscan.nextLine();
							
							Booking book1 = new Booking(c, a, b, d); // This needs to be changed in order to create a new instance each time!
							Booking.addBook(book1);
							a = 0;
							//System.out.println(Booking.getBooking(0).getGuestNum());
						}
						if(a == 2) {
							System.out.println("What would you like to order?");
							Menu.printItems();
							//Menu.printSpecials();
							a = scan.nextInt();
							TakeAway.addItem(Menu.returnItem(a));
							while(more == true) {
								
								System.out.println("Anything else? (99 to end)");
								a = scan.nextInt();
								if(a < 99) {
									TakeAway.addItem(Menu.returnItem(a));
								}
								else if(a == 99) {
									more = false;
								}
								
							}
							more = true;
							TakeAway take1 = new TakeAway(Customer.getCustomer(c));	//<------------- needs changed to create new instance
							TakeAway.addTakeAway(take1);
							System.out.println("Thanks, your order ID is: " + TakeAway.getID());
							System.out.println("--Order Items--");
							System.out.println(TakeAway.getItems());
							System.out.println("Order ready for collection in: 30 minutes. ");
						}
						if(a == 3) {
							System.out.println("What would you like to order?");
							Menu.printItems();
							//Menu.printSpecials();
							a = scan.nextInt();
							Delivery.addItem(Menu.returnItem(a));							
							while(more == true) {
								
								System.out.println("Anything else? (99 to end)");
								a = scan.nextInt();
								if(a < 99) {
									Delivery.addItem(Menu.returnItem(a));
								}
								else if(a == 99) {
									more = false;
								}
								
							}
							more = true;
							Delivery deliver1 = new Delivery(Customer.getCustomer(c));		//<------------- needs changed to create new instance
							Delivery.addDelivery(deliver1);
							System.out.println("Thanks, your order ID is: " + Delivery.getID());
							System.out.println("--Order Items--");
							System.out.println(Delivery.getItems());
							System.out.println("Your order will be with you in: 1 hour ");
						}
					}
				}
				else if(a == 2) {
					System.out.println("Please enter your First name. ");
					String b = stscan.nextLine();
					System.out.println("Please enter your Second name. ");
					String c = stscan.nextLine();
					System.out.println("Please enter your Address. ");
					String d = stscan.nextLine();
					Customer cust1 = new Customer(b, c, d);	//<------------- needs changed to create new instance
					Customer.addCustomer(cust1);
					System.out.println("Thank you, Your customer ID is: " + Customer.getID());
				}
				
			}
			// The Staff System
			else if(a == 2) {
				System.out.println("Job?");
				System.out.println("1. Manager");
				System.out.println("2. Chef");
				System.out.println("3. Waiter");
				System.out.println("4. Driver");
				a = scan.nextInt();
				if(a == 1) {
					System.out.println("Hello " + Manager.getManagerID());
					System.out.println("Please choose from the following options: ");
					System.out.println("1. Add hours worked");
					a = scan.nextInt();
					if(a == 1) {
						System.out.println("Who's hours would you like to add to?");
						System.out.println("1. Manager");
						System.out.println("2. Chef");
						System.out.println("3. Waiter");
						System.out.println("4. Driver");
						a = scan.nextInt();
						if(a == 1) {
							System.out.println("These are the Managers: ");
							Manager.printAllManagers();
							System.out.println("Enter Manager number you would like to add hours to: ");
							
							int c = scan.nextInt();
							System.out.println("How many hours would you like to add? ");
							a = scan.nextInt();
							Manager.getManager(c).addHrs(a);
							System.out.println(Manager.getManager(c).getManagerID() + " hours have now been updated.");
						}
						else if(a == 2) {
							System.out.println("These are the Chefs: ");
							Chef.printAllChefs();
							System.out.println("Enter Chef number you would like to add hours to: ");
							
							int c = scan.nextInt();
							System.out.println("How many hours would you like to add? ");
							a = scan.nextInt();
							Chef.getChef(c).addHrs(a);
							System.out.println(Chef.getChef(c).getChefID() + " hours have now been updated.");
						}
						else if(a == 3) {
							System.out.println("These are the Waiters: ");
							Waiter.printAllWaiters();
							System.out.println("Enter Waiter number you would like to add hours to: ");
							
							int c = scan.nextInt();
							System.out.println("How many hours would you like to add? ");
							a = scan.nextInt();
							Waiter.getWaiter(c).addHrs(a);
							System.out.println(Waiter.getWaiter(c).getWaiterID() + " hours have now been updated.");
						}
						else if(a == 4) {
							System.out.println("These are the Drivers: ");
							Driver.printAllDrivers();
							System.out.println("Enter Driver number you would like to add hours to: ");
							
							int c = scan.nextInt();
							System.out.println("How many hours would you like to add? ");
							a = scan.nextInt();
							Driver.getDriver(c).addHrs(a);
							System.out.println(Driver.getDriver(c).getID() + " hours have now been updated.");
						}
					}
				}
				else if(a == 2) {
					System.out.println("Are you an existing Chef?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					a = scan.nextInt();
					if(a == 1) {
						System.out.println("Please enter your Chef number: ");
						int c = scan.nextInt();
						System.out.println("Are these details correct? ");
						Chef.printChef(c);
						System.out.println("1. Yes");
						System.out.println("2. No");
						a = scan.nextInt();
						if(a == 1) {
							System.out.println("Please choose from the following options: ");
							System.out.println("1. View Orders");
							System.out.println("2. Add Menu Item");
							System.out.println("3. View Menus");
							a = scan.nextInt();
							if(a == 1) {
								System.out.println("DELIVERIES");
								Delivery.getAllItems();
								System.out.println("EAT INs");
								EatIn.getAllItems();
								System.out.println("TAKEAWAYS");
								TakeAway.getAllItems();
							}
							else if(a == 2) {
								System.out.println("Please input a special:");
								String b = stscan.nextLine();
								Menu.addItem(b);
							}
							else if(a == 3) {
								Menu.printItems();
								//Menu.printSpecials();
							}
						}
						else if(a == 2) {
							System.out.println("Please see the manager to be added to system. ");
						}
					}
					
					else if(a == 2) {
						System.out.println("Please see the manager to be added to system. ");
					}
				}
				else if(a == 3) {
					System.out.println("Please enter your Waiter number: ");
					int c = scan.nextInt();
					System.out.println("Are these details correct? ");
					Waiter.printWaiter(c);
					System.out.println("1. Yes");
					System.out.println("2. No");
					a = scan.nextInt();
					if(a == 1) {
						System.out.println("Please choose from the following options: ");
						System.out.println("1. Create Order");
						a = scan.nextInt();
						if(a == 1) {
							Menu.printItems();
							//Menu.printSpecials();
							System.out.println("Enter order items:");
							a = scan.nextInt();
							EatIn.addItem(Menu.returnItem(a));
							while(more == true) {
								
								System.out.println("Anything else? (99 to end)");
								a = scan.nextInt();
								if(a < 99) {
									EatIn.addItem(Menu.returnItem(a));
								}
								else if(a == 99) {
									more = false;
								}
								
							}
							more = true;
							EatIn eat1 = new EatIn(Waiter.getWaiter(c).getWaiterID());		//<------------- needs changed to create new instance
							EatIn.addEatIn(eat1);
							System.out.println("Order ID is: " + EatIn.getEatID());
							System.out.println("--Order Items--");
							System.out.println(EatIn.getItems());
							System.out.println("Waiter ID is: " + Waiter.getWaiter(c).getWaiterID());
						}
					
					}
					else if(a == 2) {
						System.out.println("Please see the manager to be added to system. ");
					}
				}
				else if(a == 4) {
					System.out.println("Please enter your Driver number: ");
					int c = scan.nextInt();
					System.out.println("Are these details correct? ");
					Driver.printDriver(c);
					System.out.println("1. Yes");
					System.out.println("2. No");
					a = scan.nextInt();
					if(a == 1) {
						System.out.println("Please choose from the following options: ");
						System.out.println("1. View your deliveries");
						System.out.println("2. Mark delivery as Complete");
						a = scan.nextInt();
						if(a == 1) {
							Delivery.driverDeliveries(c);
						}
						else if(a == 2) {
							Delivery.driverDeliveries(c);
							System.out.println("Please enter the number of the delivery you would like to mark as Complete");
							a = scan.nextInt();
							Delivery.getDelivery(a).setStatus();
							System.out.println(Delivery.getDelivery(a).getID() + " is now marked as Complete.");
						}
					}
					else if(a == 2) {
						System.out.println("Please see the manager to be added to system. ");
					}
				}
			}
			else if(a == 3) {
				run = false;
			}
			
		}	
		
	}	
}