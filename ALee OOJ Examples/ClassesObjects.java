package aLee;

public class ClassesObjects {
	
	static int a = 5; // variable to be called within main class below 
	
	@SuppressWarnings("static-access")
	public static void main(String []args) {  //main class 

		
		ClassesObjects c = new ClassesObjects();
		c.subtract(8, 3);
		
		System.out.println(a);
		
		
		
}
	
	public static int subtract(int a, int b) {
		return a - b;
		
	}
}

 
