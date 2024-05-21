package polymorphism;

public class checkedexcepTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program is started....");
		System.out.println("program is in progress....");

		try {
			Thread.sleep(3000);
			
		} 
		catch (Exception e) {
		
		//	e.printStackTrace();
			e.getMessage();
			System.out.println("it will print after 3 sec");
		}
		System.out.println("program is finished....");
		System.out.println("program is terminated....");
	}

}
