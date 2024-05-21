package polymorphism;

class D
{
	int a;      //int a=300;
	void display()
	{
		System.out.println(a);
	}
}
 
class E extends D
{
	int b;     //int b=200;
	void show()
	{
		System.out.println(b);
	}
}
 

public class singleinheritance {
 
	public static void main(String[] args) {
		E obj=new E();
		
		obj.a=100;
		obj.b=200;
		
		//System.out.println(bobj.a);
		//System.out.println(bobj.b);
		
		obj.display();
		obj.show();
 
	}
 
}