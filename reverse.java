/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class reverse
{
	public static void main(String[] args) {
	    Scanner cin = new Scanner(System.in);
	    int n =cin.nextInt();
	    while(n>0){
	        int rem = n%10;
	        System.out.println(rem);
	        n=n/10;
	    }
	}
}