
import java.util.*;


public class forloop_reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the Number :  ");
		int num = sc.nextInt();
		int sum = 0;
		for(  ; num > 0; num = num / 10) {
			int r = num % 10;
			sum = sum*10 + r;	
		}
				System.out.println(sum);
	}

}
