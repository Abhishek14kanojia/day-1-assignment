import java.util.*;

public class D5_harmonic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. : ");
			int n = sc.nextInt();
			for (double i = 1; i < n; i++) {
	            if (i != n)
	            {
	                System.out.println("1/" + i + "+");
	            } else if (i == n)
	            {
	                System.out.println("1/" + 1);
	            }

	        }
	}

}
