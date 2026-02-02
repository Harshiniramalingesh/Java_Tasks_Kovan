package recursivemethods;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
		naturalNumber(100);

	}
	public static void naturalNumber(int n) {
		if(n==1) {
			System.out.println(1);		}
		else {
			System.out.println(n);
			naturalNumber(n-1);
		}
		
	}
}
