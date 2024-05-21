package polymorphism;

public class methodoverloading {
 
	int x,y;
	double z;
	String S1;
	char a1;
	float f;
	
	void add() {
		System.out.println("ABC");
	}
	
	void add(int a,int b) {
		x=a;
		y=b;
		
		System.out.println(x+y);
	}
	
	void add(int a,double b,float f1) {
		x=a;
		z=b;
		f=f1;
		
		System.out.println(x+z+f1);
	}
	
	
	void add(String s,char a) {
		S1=s;
		a1=a;
		
		System.out.println(s+ a);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverloading M = new methodoverloading();
		
		M.add();
		M.add(10,20);
		M.add(2,10.5,12f);
		M.add("grade",'A');
		
		

	}

}
