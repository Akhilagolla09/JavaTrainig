package practiceprograms;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int n = 123456;
	        int rem,
	        sum=0;
	        
	       
	        while (n>0){
	        	
	            rem=n%10;
	            sum = sum+rem;
	            n=n/10;
	            
	        }
	        System.out.println("sumof the digits is:"+sum);
		
	}

}

