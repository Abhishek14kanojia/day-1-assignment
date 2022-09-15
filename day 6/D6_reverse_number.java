import java.util.*;

public class D6_reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        int r1=0;
        int r2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        n= sc.nextInt();
        for(;n!=0 ;  n=n/10)
        {
            r2=n%10;
            r1=r1*10+r2;
        }
        System.out.println( " reverse number is :" + r1 );
	}

}
