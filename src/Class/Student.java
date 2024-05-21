package Class;

public class Student {
	
	int id;
	String name;
	char grade;
	float percentage;
	
 public	void display() {            //----method
		System.out.println(id);
		System.out.println(name);
		System.out.println(grade);
		System.out.println(percentage);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
		s1.id =1;
		s1.name="Akhila";
		s1.grade='A';
		s1.percentage =99.9f;
		s1.display();
		
		System.out.println();
		
		Student s2 = new Student();
		s2.id=2;
		s2.name="Manju";
		s2.grade='A';
		s2.percentage =99.9f;
		s2.display();
		
		

	}

}
