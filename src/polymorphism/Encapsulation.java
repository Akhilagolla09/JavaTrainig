package polymorphism;

public class Encapsulation {

	private String str;
	private char ch;
	private int a;
	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj =new Encapsulation();
		
		obj.setStr("Akhila---");
		System.out.println(obj.getStr());
		
		obj.setA(10);
		System.out.println(obj.getA());
		
		obj.setCh('A');
		System.out.println(obj.getCh());
		
	}

}
