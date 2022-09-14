
import java.util.*;

public class D5_QuotientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Dividend");
		int Dividend = sc.nextInt();
		System.out.println("Enter the value of Divisor");
		int Divisor = sc.nextInt();
		
		int Quotient = Dividend/Divisor;
		System.out.println("Quotient =" + Quotient);
		
		int Reminder = Dividend%Divisor;
		System.out.println("Reminder =" + Reminder);
		
		
		}
	}


