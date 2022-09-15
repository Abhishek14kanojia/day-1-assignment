
import java.util.*;

public class D6_Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			int n = sc.nextInt();
			int n1 = 0;
			
			for (int i=2; i<=n/2; i++) {
				if (n1%i==0) {
					n1=1;
				}
			} if (n1==1) {
				System.out.println(n + " is not prime number");
				
			} else {
				System.out.println(n + " is prime number");
			}
			
				
	
	
	}

}
