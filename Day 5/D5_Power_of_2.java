
import java.util.*;

public class D5_Power_of_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Power of 2 (0-31)");
		int n = sc.nextInt();
		
		while (n <= 0 || n >= 31) {
			System.out.println("Please Enter the power can't lower than 0 & greater than 31 ");
			System.out.println("Enter the Power");
			n = sc.nextInt();
		}
		System.out.println("Power of 2");
		for (int i=0; i<n; i++) {
			System.out.println((int)Math.pow(2,i));
		}
	}

}
