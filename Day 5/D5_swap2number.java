
import java.util.*;

public class D5_swap2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value a :");
		int a = sc.nextInt();
		System.out.println("Enter the Value b :");
		int b = sc.nextInt();
	        int temp=0;
	        System.out.println(" Before swap ");
	        System.out.println("first number = " + a );
	        System.out.println("second number = " + b );
	        {
	            temp = a;
	            a = b;
	            b = temp;
	        }

	        System.out.println(" after swap ");
	        System.out.println("first number = " + a );
	        System.out.println("second number = " + b );
	}

}
