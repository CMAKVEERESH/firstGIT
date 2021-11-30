package November24;
import java.util.Scanner;
public class Numbers {
	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		System.out.println("enter i value");
				int i =Scan.nextInt();
				System.out.println("enter n value");
				int n= Scan.nextInt();
				do {
					System.out.println(i+" ");
					i++;
				}
				while(i<=n);
	}

}
