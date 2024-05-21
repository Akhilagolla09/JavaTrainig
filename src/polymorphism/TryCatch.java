package polymorphism;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number:");    

		
		try {
			
/*		int a=sc.nextInt();                   

		System.out.println(100/a);  */
			
	    int a[] = new int[5];
	    int num= sc.nextInt();
		System.out.println("Enter position(0-4):");

		int pos = sc.nextInt();

		a[pos] = num;                             // ArrayIndexOutOfBoundsException

		System.out.println(a[pos]);
		}
		
		catch(ArithmeticException x){
			System.out.println("arithmatic exception");
			
		}
		
		catch(ArrayIndexOutOfBoundsException y) {
			System.out.println("out of bounds ");
		}

		finally{
        System.out.println("Program is  completed..");

		System.out.println("Program is  exited..");	
		
}
		
		
		
	}

}
