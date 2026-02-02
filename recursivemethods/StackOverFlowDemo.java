package recursivemethods;

public class StackOverFlowDemo {
    public static void main(String[] args) {
	    int n=10;
	    print(n);

	}
	public static void print(int n) {
		System.out.println(n);
		print(n-1);
	}
}
