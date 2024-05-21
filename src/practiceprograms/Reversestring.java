package practiceprograms;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        String str = "akhila";
        String rev = " ";
      
        
        
      //  int len = str.length();   ----length of string
        
        
        for (int i=str.length()-1;i>=0;i--){
        
          rev = rev+str.charAt(i);


        }
        System.out.println(rev);
	}

}
