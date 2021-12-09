package assignment;

import java.util.Scanner;

public class Generations {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		int a= scan.nextInt();
		int b= 2021;
		int c=2021-a;
		System.out.println(c);
		if(c>=1997 && c<=2012) {
			System.out.println("Gen Z");
		}
		else if(c>=1981 && c<=1996) {
			System.out.println("Millennials");
		}
		else if(c>=1965 && c<=1980) {
			System.out.println("Gen X");
		}
		else if(c>=1955 && c<=1964) {
			System.out.println("Boomers 2");
		}
		else if(c>=1946 && c<=1954) {
			System.out.println("Boomers 1");
		}
		else if (c>=1928 && c<=1945) {
			System.out.println("Post War");
		}
		else if(c>=1922 && c<=1927) {
			System.out.println("WW 2");
		}
		else {
			System.out.println("this program belongs to age group between 9 to 99");
		}
		
		
	}

}
