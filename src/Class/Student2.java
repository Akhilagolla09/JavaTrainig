package Class;

public class Student2 {
	
	
	int sid;
    String sname;
	 
	void display() {                               //method
		System.out.println(sid+ " " +sname);
 	}

//method
		void setdata(int id,String name) {             //method
			
			sid=id;
			sname=name;
			
			
		}
		
//Constructor
		Student2(int id,String name){
			sid=id;
			sname=name;
		}
	
	public static void main(String[] args) {
		
		
		Student2 s1 = new Student2(1,"akhila");     //constructor
		
//		Student2 s1 = new Student2();
		s1.setdata(2 ,"Akhila");
		s1.display();
		
	}

}
