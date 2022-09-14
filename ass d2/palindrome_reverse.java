
import java.util.*;

public class palindrome_reverse {

	public static void main(String[] args) {
		int n,s=0,c,r;
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 c = n;
		 r = n%10;
		for (  ; n>0; n=n/10) {
			s = (s*10)+r;
		} if (c ==s) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
