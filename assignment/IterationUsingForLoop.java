package assignment;
import java.util.LinkedList;
public class IterationUsingForLoop {
	private static LinkedList MyCricketers = new LinkedList();
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

		Cricket cricket;
		for(int i=0;i<MyCricketers.size();i++) {
			cricket = (Cricket) MyCricketers.get(i);
			System.out.println(cricket.getName()+" ");
		}
	}

}
