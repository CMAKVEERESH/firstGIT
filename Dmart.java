package veeresh;

import java.util.ArrayList;
import java.util.Scanner;

public class Dmart {
	public static void main(String[] args) {
		System.out.println("Enter the choices");
		System.out.println("case1: Add items");
		System.out.println("case2: Display items");
		System.out.println("case3: Replacing items");
		System.out.println("case4: Removing item");
		System.out.println("case5: Display item");
		System.out.println("choice6: Quit");
		ArrayList list= new ArrayList();
		Scanner scan = new Scanner(System.in);
	int a= scan.nextInt();
	while(a!=6) {
		switch(a) {
		case 1: System.out.println("enter the no of items");
			int b= scan.nextInt();
			while(b>0) {
			System.out.println("enter the item"); 
			String c= scan.next();
				list.add(c);
				b--;
			}
			break;
		case 2: for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		break;
		case 3:System.out.println("enter the index");
		int f= scan.nextInt();
		System.out.println("enter the replacing item");
		String g= scan.next();
		list.remove(f);
		list.add(f, g);
		break;
		case 4:System.out.println("enter the index");
		       int d= scan.nextInt();
			list.remove(d);
			break;
		case 5: System.out.println("enter the index");
		int e= scan.nextInt();
		System.out.println(list.get(e));
		break;
		default: 
         break;
		}
		System.out.println("Enter the choices");
		System.out.println("case1: Add items");
		System.out.println("case2: Display items");
		System.out.println("case3: Replacing items");
		System.out.println("case4: Removing item");
		System.out.println("case5: Display item");
		System.out.println("choice6: Quit");
		 a= scan.nextInt();
		}
	System.out.println("thank you visit again");
	
	}
	
	
	}
	


