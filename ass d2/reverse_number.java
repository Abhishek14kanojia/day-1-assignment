
import java.util.*;

public class reverse_number {

	public static void main(String[] args) {
		int n,r;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while(n>0) {
			r = n % 10;
			System.out.print(r);
			n = n / 10;
			
		}

	}

}
