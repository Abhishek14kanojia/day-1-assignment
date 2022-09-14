
import java.util.*;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r,sum = 0,temp;
		int n = sc.nextInt();
		temp = n;
		
		for (  ; n>0; n=n/10);
		sum = (sum*10 ) + r;
		
		if (temp ==sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome Number");
		}

	}

}
