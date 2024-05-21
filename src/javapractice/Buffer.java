package javapractice;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string buffer:directly adds in heap memory and mutable. inbuilt capacity is 16
		
	  StringBuffer sb = new StringBuffer("Abc");
	  sb =  new StringBuffer("Abc xyz");
	  System.out.println(sb);
	  
	  sb = sb.append(" gef");
	  System.out.println(sb);
	  
	  sb.insert(2,"xyz");
	  System.out.println(sb);
	  
	  sb.deleteCharAt(1);
	  System.out.println(sb);
	  
	  sb.reverse();
	  System.out.println(sb);
	  
	  sb.delete(2, 4);
	  System.out.println(sb);
	  
	  StringBuffer sb1 = new StringBuffer();
	  sb1.capacity();
	  System.out.println(sb1.capacity());
	  
	  StringBuffer sb2 = new StringBuffer("abc z");
	  sb2.capacity();
	  System.out.println(sb2.capacity());
	  
	  
//	  synchronization occurs only in Stringbuffer,thread(some pause) 
//	  builder -we don't use any threads,synchro in builder thats y performance is very high 
	  
//    thread --	task will perform in certain time
		
		
		

	}

}
