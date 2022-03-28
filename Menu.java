import java.util.ArrayList;
import java.util.Collections;

/*--------------INFO--------------------
		Author D Connolly (2128770)
----------------------------------------*/

public class Menu {
	
		//creates the arraylists for menu items & specials
		private static ArrayList<String> items = new ArrayList<>();
		
		//not required as special is now entered in items.
		//private static ArrayList<String> specials = new ArrayList<>();
		
		static {
			items.add("0. Tea");
			items.add("1. Coffee");
			items.add("2. Bagel");
			items.add("3. Donut");
			items.add("4. Croissant");
			items.add("5. Sandwich");
			items.add("6. Pizza");
			items.add("7. Cupcake");
			items.add("8. Full English");
			items.add("9. Salad");
			items.add("10. Cake");
			items.add("11. Ice Cream");
			
			items.add("12. SPECIAL Curry");
		}
		
		
		//Below are the items methods
		public static void addItem(String item) {
			items.add(item);
		}
		
		public static String returnItem(int i) {
			return items.get(i).toString();
		}
		
		public static void printItems() {
			System.out.println("--Menu--");
			System.out.println(items.toString());
		}
		
		public static void removeItem(int i) {
			items.remove(i);
		}
		
		
		/* Below are the specials methods
		public static void addSpecial(String item) {
			specials.add(item);
		}
		
		public static String returnSpecial(int i) {
			return specials.get(i).toString();
		}
		
		public static void printSpecials() {
			System.out.println("--Specials--");
			System.out.println(specials.toString());
		}
		
		public static void removeSpecial(int i) {
			specials.remove(i);
		}
		*/
}
