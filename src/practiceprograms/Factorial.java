package practiceprograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
        int fact = 1;
        
        for (int i=1;i<=n;i++){  
        	
            fact = fact*i;           
            
        }
        System.out.println("factoria of given number is: "+fact);   //4*3*2*1=24
 	
	}

}
