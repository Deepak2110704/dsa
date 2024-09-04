import java.util.*;

public class sum
{
	public static void main(String[] args) {
	    Scanner cin = new Scanner(System.in);
	    int n =cin.nextInt();
	    int sum=0;
	    while(n>0){
	        int rem = n%10;
	        sum=sum+rem;
	        System.out.println(rem);
	        n=n/10;
	    }
	    System.out.println();
	     System.out.println(sum);
	}
}