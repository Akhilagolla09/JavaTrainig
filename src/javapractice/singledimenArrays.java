package javapractice;

public class singledimenArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 /*      int arr[] =new int[5];
		
		arr[0]=200;
		arr[1]=300;
		arr[2]=400;
		arr[3]=500;
		arr[4]=600;    
		
		int[] arr1 = {100,200,300,400,500};
		
		int l=arr1.length;
		System.out.println(l);
		System.out.println(arr1[3]);
	
		System.out.println("\n");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println("\n");
		for(int x:arr1) {
			System.out.print(x +" ");
			
			
		}            */
		
		
		int[] a = new int[4];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		System.out.println(a[2]);
		
		int b[] = {10,20,30,40};
		
		System.out.println(b.length);
		
		System.out.println("\n");
		
		for(int i=0;i<3;i++) {
			System.out.println(b[i]);
			
		}
		
		System.out.println("\n");
		
		for(int x:b) {
			System.out.println(x);
		}
		
		
	
	}

}
