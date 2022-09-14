import java.util.*;

public class D5_leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Year : ");
			int year = sc.nextInt();
			
			if ((year%400==0) || (year%4==0) && (year%100!=0)) {
				System.out.println("This is Leap Year");
			} else {
				System.out.println("This is not Leap Year");
			}
	}

}
