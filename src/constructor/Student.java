package constructor;

public class Student {
	
//Prameterized
	
	int sid;
    String sname;
    char sc;

	Student(int a, String b, char c){      //constructer(parameters)
		
		sid =a;
		sname =b;
		sc =c;
			
	}
	
	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sc);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s= new Student(10,"akhila",'A');  //arguments
		s.show();
	}

}
