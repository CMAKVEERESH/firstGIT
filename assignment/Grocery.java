package assignment;
import java.util.ArrayList;

public class Grocery {
	private static ArrayList myList = new ArrayList();
	public static void main(String[] args) {
		GroceryShoppingCart gsc1= new GroceryShoppingCart("rice",25,1);
		GroceryShoppingCart gsc2= new GroceryShoppingCart("wheat",15,1);
		GroceryShoppingCart gsc3= new GroceryShoppingCart("brinjal",35,1);
		GroceryShoppingCart gsc4= new GroceryShoppingCart("tomatto",45,1);
		GroceryShoppingCart gsc5= new GroceryShoppingCart("chilly",55,1);
		 myList.add(gsc1);
		 myList.add(gsc2);
		 myList.add(gsc3);
		 myList.add(gsc4);
		 myList.add(gsc5);
		 getGroceryShoppingCart();
		 }
	public static void getGroceryShoppingCart() {
		for(Object cart : myList) {
			GroceryShoppingCart myList = (GroceryShoppingCart)cart;
			System.out.println(myList.getItemname+"  "+myList.getItemprice()+" "+myList.getItemquantity());
		}
	}
}
