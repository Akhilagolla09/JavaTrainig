package practiceprograms;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n=21;
		  int count = 0;
		  
	        for (int i=2;i<=n/2;i++){
	            if (n%i==0){
	                count=1;
	            }
	        }

	
	        if(count==0) {
	        System.out.println("not prime");
	    }
	        else{
	            System.out.println(" prime");
	    }
	}

}
