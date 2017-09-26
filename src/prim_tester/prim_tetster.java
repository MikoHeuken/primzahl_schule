package prim_tester;

public class prim_tetster {

	public static void main(String[] args) {
		
		
		System.out.println(isPrim(8));
		
	}

	


	private static boolean isPrim(int z){
		
		boolean prim=false;
		int i=z;
		
		  if (z==1){ 
		  prim=false;
		  }
		  else{
			  
		    while(i<=z-1 && prim==false){
		    	
		      if (z%i==0){
		        prim=false;
		      }
		      else{
		        prim=true;
		      }
		      i=i+1;
		    }
		  }
		return prim;
	}
	

}
