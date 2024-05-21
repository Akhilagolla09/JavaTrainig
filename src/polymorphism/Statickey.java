package polymorphism;

public class Statickey {

	static int a;
    static int b;
	char c;
	void add() {
		System.out.println("Good mrng");
	}
	static void add1(int x,int y) {
		a=x;
		b=y;
	}
	void add2(int x,int y,char z) {
		a=x;
		b=y;
		c=z;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add1(3,4);
		Statickey obj=new Statickey();
		obj.add2(2, 4, 'A');
		obj.display();

		
		
	}
}


