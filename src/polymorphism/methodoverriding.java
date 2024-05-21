package polymorphism;

class Bank {
	int roi() {
		return 10;
	}
}

class ICICI extends Bank {
	int roi() {
		return 20;
	}
}

class SBI extends Bank {
	int roi() {
		return 30;
	}
}

class HDFC extends Bank {
	int roi() {
		return 40;
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bank obj=new Bank();
		System.out.println(obj.roi());
		
		ICICI obj1=new ICICI();
		System.out.println(obj1.roi());
		
		SBI obj2=new SBI();
		System.out.println(obj2.roi());
		
		HDFC obj3=new HDFC();
		System.out.println(obj3.roi());
 

	}

}
