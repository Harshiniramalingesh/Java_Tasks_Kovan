package recursivemethods;

public class PassByValue {
    
	public static void main(String[] args) {
		int a = 10;
		change(a);
		System.out.println(a);

	}
	public static void change(int n) {
		n = 100;
		System.out.println(n);
	}

}
