import java.util.Scanner;

public class NumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num > 0)
	            System.out.println("Positive");
	        else if (num == 0)
	            System.out.println("Zero");
	        else
	            System.out.println("Negative");


	}

}
