import java.util.*;

public class D5_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Value :");
			int factor = 1;
			int n = sc.nextInt();
			for (int i = 0; i <= n; i++) {
				factor = factor * n;
				System.out.println(factor);
			}
			
			
	}

}
