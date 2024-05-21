package javapractice;

public class immutablestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Case 1: String s1="welcome";
		 *  String s2="welcome";
		 * 
		 * System.out.println(s1==s2); //compare variables
		 * System.out.println(s1.equals(s2)); //compares value of the object/variable
		 * 
		 * String s3="java"; String s4="selenium";
		 * 
		 * System.out.println(s3==s4); System.out.println(s3.equals(s4));
		 */

		String s1 = "Akhila";
		String s2 = "Akhila";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = "Akhila";
		String s4 = "akhila";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

/*
  Case 2: 
		 
		  String s1="welcome"; 
		  String s2=new String("welcome");
		  
		  System.out.println(s1==s2); //compare variables
		  System.out.println(s1.equals(s2));
		  
		  String s3="java"; 
		  String s4=new String("selenium");
		  
		  System.out.println(s3==s4); 
		  System.out.println(s3.equals(s4));
*/


		  String s5="Akhila"; 
		  String s6=new String("Akhila");
		  
		  System.out.println(s5==s6);                //differnt address
		  System.out.println(s5.equals(s6));         //same values
		  
		  String s7="Name"; 
		  String s8=new String("Akhila");
		  
		  System.out.println(s7==s8); 
		  System.out.println(s7.equals(s8));
		
		
/*
 case 3 
		 String s1="welcome"; 
		 String s2=new String("welcome"); 
		 String s3=s2;
		 
		 System.out.println(s3==s2); 
		 System.out.println(s3.equals(s2));
		 System.out.println(s1==s2);           		 */
		  
		  String a="Akhila"; 
			 String b=new String("akhila"); 
			 String c=b;
			 
			 System.out.println(a==b); 
			 System.out.println(b.equals(c));
			 System.out.println(c==b); 
		  
		  
		  

	}

}
