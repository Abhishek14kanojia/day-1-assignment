import java.util.*;
public class displayunit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int button = sc.nextInt();
		 
		 if (button == 1) {
			 System.out.println("One");
		 } else if (button == 10) {
			 System.out.println("Ten");
		 } else if (button == 100) {
			 System.out.println("Hundred");
		 } else if (button == 1000) {
			 System.out.println("Thousand");
		 } else {
			 System.out.println("Invaild Number");
		 }

	}

}
