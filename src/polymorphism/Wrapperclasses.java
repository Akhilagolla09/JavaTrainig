package polymorphism;

public class Wrapperclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//unboxing 
		Integer i = new Integer(10);
//		int a=i;
		int a =i.intValue();                        //value method                                 
		System.out.println(a);
		
		Float f = new Float(22.3f);
		float b=f;
		System.out.println(b);
		
		Double d=new Double(10.4);
		double b1=d;
		System.out.println(b1);
		
		Character C1= new Character('B');
		char C2=C1;
		System.out.println(C2);
		
		Boolean B1=new Boolean(false);
		boolean B3=B1;
		System.out.println(B3);
		
		Long L= new Long(45674567);
		long L3=L;
		System.out.println(L3);
		
		Short s2=2200;
		Short s3=new Short(s2);
		
		short s4=s3;
		
		System.out.println(s4);
		
		
		
//Autoboxing
		int c= 20;
		Integer i1 =c;
//		Integer i1=Integer.valueOf(c);               //valueOf method 
		System.out.println(i1);
		
		float c1=30.2f;
		Float f1=c1;
//		Integer f1=Integer.valueOf(c1);
		System.out.println(f1);
		
		double d1=40;
//		Double d2= d1;
		Double d2=Double.valueOf(d1);
		System.out.println(d2);
		
		char c2='A';
		Character c3=c2;
		System.out.println(c3);
		
		byte b2=2;
		Byte b4=b2;
//		Byte b4=Byte.valueOf(b2);
		System.out.println(b4);
		
		long l=123456;
		Long l1=l;
//		Long l1=Long.valueOf(l);
		System.out.println(l1);
		
		short s=2200;
		Short s1=s;
//      Short s1=Short.valueOf(s1);
		System.out.println(s1);
		
		boolean B=true;
		Boolean B2=B;
//		Boolean B2=Boolean.valueOf(B);
		System.out.println(B2);
		
		
		
		
	}

}
