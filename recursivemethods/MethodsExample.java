package recursivemethods;

public class MethodsExample {
   public static void main(String[] args) {
		// Predefined methods
		
		System.out.println("Predefined Methods " + Math.pow(2, 5));
		
		//userdefined Methods
		int a = 2;
		int b = 5;
		
		powerExample(a,b);

	}
	
	public static void powerExample(int a,int b) {
		int multiply = 1;
		for(int i = 1;i<=b;i++) {
			multiply *= a;
		}
		System.out.println("UserDefined methods " + multiply);
	} 
}
