package polymorphism;

interface Printing{   
void print();      //abstract 
 
}  
 
interface Showing{  
void print1();  
}  
 
class interface_class implements Printing,Showing {
	public void print() {
		System.out.print("Hello");
	}
    public void print1() {
		System.out.print(" java");
	}
}

public class multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printing obj= new interface_class();
		obj.print();
		
	
		Showing obj1= new interface_class();
		obj1.print1();
	
		

	}

}
