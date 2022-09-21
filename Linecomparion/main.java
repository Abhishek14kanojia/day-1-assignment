package Linecomparion;

public class main {

	public static void main(String[] args) {
		
		line l1 = new line();
		
		l1.p1 = new point();
		l1.p1.x = 5;
		l1.p1.y = 10;
		
		l1.p2 = new point();
		l1.p2.x = 15;
		l1.p2.y = 20;
		
		line l2 = new line();
		
		l2.p3 = new point();
		l2.p3.x = 5;
		l2.p3.y = 10;
		
		l2.p4 = new point();
		l2.p4.x = 15;
		l2.p4.y = 20;
		
		
		float length1 = l1.getlength();
		System.out.println(length1);
		
		float length2 = l2.length();
		System.out.println(length2);
		
		if (length1 == length2) {
			System.out.println("Line_and_Point_as_well_as_equals");
		} else {
			System.out.println("Line_and_Point_boths_are_not_equals");
		}
	}

}
