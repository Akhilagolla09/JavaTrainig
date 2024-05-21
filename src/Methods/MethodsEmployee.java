package Methods;


public class MethodsEmployee {

	
	int id;
	String name;
	
	//non return type
		public void display() {                                          
			System.out.println(id);
			System.out.println(name);
		}
		
	//return type	
		public String show() {                                                   
			String s ="Akhila";
			String s1 ="manju";
			return s1;
		}
		
		int show1() {
			int a =10;
			int b =20;
			return b;
		}
		
		char show2() {
			char a ='A';
			return a;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     MethodsEmployee e1 = new MethodsEmployee();
		
		e1.id=1;
		e1.name="akhila";
		
		e1.display();
		
		e1.show();
		e1.show1();
		e1.show2();
		
		System.out.println(e1.show());
		System.out.println(e1.show1());
		System.out.println(e1.show2());


	}

}
