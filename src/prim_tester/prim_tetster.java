package prim_tester;

public class prim_tetster {

	public static void main(String[] args) {
		

		for(int n = 3; n <=1000; n++){
			
			if(isPrime(n))
			
			System.out.println(n);
		}
		
	}
		
	private static boolean isPrime(int n){
		boolean prime=true;
		int i = 2;
	
		  
		  if (n == 1) {
		    prime=false;
		  }
		  else{
		    while (i <= n-1 && prime == true) {
		      if (n%i==0) {
		        prime=false;
		      }
		      i=i+1;
		    }
		  }
		 return prime;
	}
}