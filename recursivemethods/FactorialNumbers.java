package recursivemethods;

public class FactorialNumbers {
    public static void main(String[] args) {
		int n = 5;
		fact(n);

	}
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}
