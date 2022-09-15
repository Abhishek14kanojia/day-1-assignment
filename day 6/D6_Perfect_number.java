
import java.util.*;

public class D6_Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i=0; i<n/2; i++) {
			if (n%i==0) {
			sum = sum+i;}
			
		}if (n==sum) {
			System.out.println(n + "perfect number");
		} else {
			System.out.println(n + "not perfect number");
		}
		
		
		
	}

}
