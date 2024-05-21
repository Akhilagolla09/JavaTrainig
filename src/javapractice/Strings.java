package javapractice;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java";
		 
		String S1 = new String("Java");
		
		System.out.println(s);
		System.out.println(S1);
		
		System.out.println(S1.length());    //length of string 
		
/*		//Concat - adding 2 strings
		String a = "Java ";
		String b = "Automation";
		System.out.println(a.concat(b));

		String c = "Testing";
		
		System.out.println(a+b+c);
		System.out.println(a.concat(b).concat(c));             */
		
		String a = "xyx ";
		String b = " abc ";
		String c = "def ";
		
		System.out.println(c.concat(a).concat(b));
			
/*		String a1 ="         xyz     "; 
		System.out.println(a1.trim());            //remove spaces 
	    System.out.println(a1.trim().length());   //Without spaces 
	    System.out.println(a1.length());          //with space
		
		String str ="selenium";
		System.out.println(str.charAt(5));        //To find Index of a charecter         */
		
		String a1 = "      akhila   ";
		System.out.println(a1.trim());
		System.out.println(a1.trim().length());   
	    System.out.println(a1.length()); 
	    
	    System.out.println(a1.trim().charAt(3));
	 	
	    
/*		//contains - returns boolean values 
		String b1 ="selenium";
		System.out.println(b1.contains("se"));          */
	    
	    String b1 ="Akhila";
		System.out.println(b1.contains("fg"));  //false
		System.out.println(b1.contains("Ak"));   //true
		
		
/*		//equals - returns boolean values
		String b2="Selenium";
		String b3="selenium";
		System.out.println(b2.equals(b3));                     */
		
		String b2="AkhiLa";
		String b3="Akhila";
		System.out.println(b2.equals(b3));    //false
		
		
/*		//equalsIgnore - returns boolean values
		System.out.println(b2.equalsIgnoreCase(b3));               */
		
		System.out.println(b2.equalsIgnoreCase(b3));
		

/*		//replace
		s = "Welcome to selenium";
		System.out.println(s.replace('e','s'));
		System.out.println(s.replace("to","and"));                   */
		
		String s2 = "Java automation testing";
		System.out.println(s2.replace('t','a'));
		System.out.println(s2.replace("java","xyz")); 
		
		
/*		//substring - to extract substring from the main string 
		s="welcome";
		System.out.println(s.substring(2,7));                         */
		
		String s3 = "automation";
		System.out.println(s3.substring(1,5)); 
		
/*		//split
	    String s2 = "abc@gmail.com";
	    String arr[] = s2.split("@");
		System.out.println(arr[0]);
		System.out.println(arr[1]);                    */
		
		 String s4 = "xyz12@gmail.com";
		 String arr[] = s4.split("g");
	     System.out.println(arr[0]);
		
		
/*	    s="WelCome";
	    System.out.println(s.toUpperCase());   //convert to uppercase
	    System.out.println(s.toLowerCase());   //convert to lowercas            */
	     
	     String s5="Akhila";
		 System.out.println(s5.toUpperCase());   
		 System.out.println(s5.toLowerCase()); 
	    
		
		
		
		
	}

}
