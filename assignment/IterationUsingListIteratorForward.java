package assignment;
import java.util.ArrayList;
import java.util.ListIterator;
public class IterationUsingListIteratorForward {
private static ArrayList MyCricketers = new ArrayList();
	
	public static void main(String[] args) {
	Cricket dhoni = new Cricket("Dhoni", "Captain Cool");
	Cricket kohli = new Cricket("Kohli", "Run Machine");
	Cricket raina = new Cricket("Raina", "Chinna Thala");
	Cricket jadeja= new Cricket("Jadeja", "Best Fielder");


MyCricketers.add(dhoni);
MyCricketers.add(kohli);
MyCricketers.add(raina);
MyCricketers.add(jadeja);
getCricket();


}

public static void getCricket() {
	ListIterator li = MyCricketers.listIterator();
	while(li.hasNext()) {
		Cricket cric =(Cricket) li.next();
		System.out.println(cric.getName()+" is a "+cric.getIdentity());
	}



}

}
	

