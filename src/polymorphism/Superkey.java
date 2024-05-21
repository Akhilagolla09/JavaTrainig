package polymorphism;

class Animal{
	String color="White";
	void eat() {
		System.out.println("Eating");
	}
}
 
class Dog extends Animal{
	String color="Black";
	void eat1() {
		System.out.println("Eat meat");
	}
	void display() {
		System.out.println(color);
		System.out.println(super.color);//Extracting parent class properties by using super keyword
	}
}

public class Superkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog obj=new Dog();
		
		obj.display();
		obj.eat1();
		obj.eat();
		
		
		
		
	}

}
