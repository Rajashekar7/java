import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
	    System.out.println("Enter a Number:");
		int x;
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		if(x%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		}
			

	}
