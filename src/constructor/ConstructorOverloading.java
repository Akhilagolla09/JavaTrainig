package constructor;

public class ConstructorOverloading {

	int x,y;
	double z;
	float w;
	
     ConstructorOverloading() {
		System.out.println("Hiiiiiiiii");
	}
	
     ConstructorOverloading(int a,int b) {
		x=a;
		y=b;
		System.out.println(x+" "+y);
		System.out.println(x+y);
	}
	
	ConstructorOverloading(int a,double c) {
		y=a;
		z=c;
		System.out.println(y+" "+z);
	}
	
   ConstructorOverloading(int a,float d,double c) {
		x=a;
        w=d;
		z=c;
		System.out.println(x+" "+w+" "+z);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading obj=new ConstructorOverloading();
		ConstructorOverloading obj1=new ConstructorOverloading(10,20);
		ConstructorOverloading obj2=new ConstructorOverloading(30,40.0);
		ConstructorOverloading obj3=new ConstructorOverloading(50,60.0f,70.0);

	}

}
