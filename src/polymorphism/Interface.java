package polymorphism;

interface drawable{
	 void draw();
}

class Rectangle implements drawable {
	public void draw() {
		System.out.println("This is Rectangle");
	}
}

class Circle implements drawable {
	public void draw() {
		System.out.println("This is Circle");
	}
}

public interface Interface {
	
	public static void main(String[] args) {
		
		drawable s = new Rectangle();
		drawable s1 = new Circle();
		s.draw();
		s1.draw();
	}

}
