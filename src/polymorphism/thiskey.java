package polymorphism;

public class thiskey {

	int a,b;
	double d;
	
	void sum(int x,int y,double z) {
		this.a=x;
		this.b=y;
		this.d=z;
		
		System.out.println(x+y+z);
	}
	
	thiskey(double d,int a){
		this.d=d;
		this.a=a;
		
		System.out.println(d+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thiskey obj = new thiskey(40.5,10);
		
		obj.sum(10,20,40.5);
		
		
		

	}

}
