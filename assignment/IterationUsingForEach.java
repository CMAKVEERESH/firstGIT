package assignment;

import java.util.LinkedList;

public class IterationUsingForEach {
private static LinkedList MyCricketers = new LinkedList();
public static void main(String[] args) {
	
	Cricket dhoni = new Cricket("Dhoni", "Captain Cool");
	Cricket kohli = new Cricket("Kohli", "Run Machine");
	Cricket raina = new Cricket("Raina", "ChinnaThala");
	Cricket jadeja = new Cricket("Jadeja", "Best Fielder");
	
	MyCricketers.add(dhoni);
	MyCricketers.add(kohli);
	MyCricketers.add(raina);
	MyCricketers.add(jadeja);
	
	getCricket();
}

public static void getCricket() {
	for(Object cricket : MyCricketers) {
		Cricket cric = (Cricket)cricket;
		System.out.println(cric.getName()+" is a "+cric.getIdentity());
	}
}
}



