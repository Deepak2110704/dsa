public class prime
{
	public static void main(String[] args) {
	    Scanner cin = new Scanner(System.in);
	    int n=cin.nextInt();
	    int count=0;
	    System.out.println(n);
	    for(int i=1;i<=n;i++){
	        if(n%i==0){
	            count++;
	        }
	        
	    }
	        if(count==2){
	            System.out.println("it a prime number");
	        }
	        else{
	            System.out.println("its not a prime number");
	        }
	    
	    }
}
