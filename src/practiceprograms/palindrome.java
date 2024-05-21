package practiceprograms;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    String str = "MADAM";      
	        String rev = "";
	        for (int i=str.length()-1;i>=0;i--){
	            rev = rev+str.charAt(i);
	        }
	        if (str.equals(rev)) {

	            System.out.println("it is palidrome");
	        }
	        else {
	            System.out.println("it is not palidrome");
	        }
	}

}
