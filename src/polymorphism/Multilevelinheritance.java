package polymorphism;

class A {
	int a;// int a=300;

	void display() {
		System.out.println(a);
	}
}

class B extends A {
	int b;// int b=200;

	void show() {
		System.out.println(b);
	}
}

class C extends B {
	int c;// int c=100;

	void print() {
		System.out.println(c);
	}

}

public class Multilevelinheritance {

	public static void main(String[] args) {

		C obj = new C();
		
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		
		obj.display();
		obj.show();
		obj.print();

	}

}