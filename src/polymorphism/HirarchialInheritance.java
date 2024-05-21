package polymorphism;

class parent {
	int a, b;

	void method() {

		System.out.println("Hello");
	}
}

class child1 extends parent {
	int c;

	void method1() {

		System.out.println("Hiiiii");
	}
}

class child2 extends parent {
	int d;

	void method2() {

		System.out.println("HiHello");
	}

}

public class HirarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 obj = new child1();
		obj.method();
		obj.method1();

		child2 obj1 = new child2();
		obj1.method();
		obj1.method2();

	}

}
