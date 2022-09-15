
import java.util.*;

public class D3_line_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println(" x co-ordinate of first point of  first line ");
        int x1 = sc.nextInt();
        System.out.println(" y co-ordinate of first point of  first line ");
        int y1 = sc.nextInt();
        System.out.println(" x co-ordinate of Second point of  first line ");
        int x2 = sc.nextInt();
        System.out.println(" y co-ordinate of Second point of  first line ");
        int y2 = sc.nextInt();
        System.out.println(" x co-ordinate of first point of  Second line ");
        int a1 = sc.nextInt();
        System.out.println(" y co-ordinate of first point of  Second line ");
        int b1 = sc.nextInt();
        System.out.println(" x co-ordinate of Second point of  Second line ");
        int a2 = sc.nextInt();
        System.out.println(" y co-ordinate of Second point of  Second line ");
        int b2 = sc.nextInt();
        System.out.println("First Co-ordinate of first line are (" + x1 + "," + y1 + ")");
        System.out.println("Second Co-ordinate of first line are (" + x2 + "," + y2 + ")");
        System.out.println("First Co-ordinate of Second line are (" + a1 + "," + b1 + ")");
        System.out.println("Second Co-ordinate of Second line are (" + a2 + "," + b2 + ")");
        double length_of_line1;
        double length_of_line2;
        double x = (x2 - x1);
        double y = (y2 - y1);
        double a = (a2 - a1);
        double b = (b2 - b1);
        x = x * x;
        y = y * y;
        a = a * a;
        b = b * b;
        double temp1 = x + y;
        double temp2 = a + b;
        length_of_line1 = Math.sqrt(temp1);
        length_of_line2 = Math.sqrt(temp2);
        System.out.println("Length of First line = " + length_of_line1);
        System.out.println("Length of Second line = " + length_of_line2);
        equalmethod(length_of_line1, length_of_line2);
    }

    public static void equalmethod(double a, double b) {
        if (a == b ) {
            System.out.println("Both Line Are Equal.......");
        } else {
            System.out.println("Both Line Are NOT Equal.......");
        }
	}

}
