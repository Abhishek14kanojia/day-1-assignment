
import java.util.*;

public class d5_flip_coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int flip_coin = sc.nextInt();
		int Head = 0;
		int Tail = 0;
		
		for (int i=0; i<flip_coin; i++) {
			if(Math.random()<0.5){
				System.out.println("Tail");
				Tail++;
			} else {
				System.out.println(" it ia s head ");
                Head++;
			}
		}System.out.println("number of  Tail :" + Tail);
        System.out.println("number of head :" + Head);

        int tailPercent=(Tail*100)/flip_coin;
        int headPercent=(Head*100)/flip_coin;
        System.out.println("percentage of tail & head is : Tail"+ tailPercent +" % vs head"+headPercent+"%");
	}

}
