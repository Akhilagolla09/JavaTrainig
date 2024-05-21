package Methods;

public class Student {
		
//no parameters no return type
	void display() {
		
		System.out.println("Akhila");
	}

//no parameters with return type
	
	int show() {
		int a =10;
		int b=20;
		return (a+b);  
	}
	
//with parameters with return value 
	
	String show1(String a) {
		System.out.println("Akhila"+ a);
		return a;
		
	}
	
//with parameter no return value
	void show2(String b ) {
		
		System.out.println(b);
		 
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s= new Student();
		
		int t =s.show();
		
		
		s.display();
		System.out.println(t);
		
		
		
		
		
		
		
		
	    
		
		
	}

}
