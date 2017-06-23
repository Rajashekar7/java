import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    System.out.println("Enter a Number:");
	    int y=Integer.parseInt(in.nextLine());
	    for(int x=1;x<=y;x++){
		//x=in.nextInt();
		if(x%2==0)
			System.out.println("Even" +x);
		else
			System.out.println("Odd" +x);
		}

	}
}