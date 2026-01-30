package controlstatements;

public class ControlFlow {
    public static void main(String[] args) {
		int a = 10,b = 20,c = 30;
		int max1 = 0;
		if(a>b && a>c) {
			max1 = a;
		}
		else if(b>c) {
			max1 = b;
		}
		else {
			max1 = c;
		}
		System.out.println(max1);
		int x = 50,y = 40;
		
		int max2 = (x>y) ? x : y;
         System.out.println(max2);
	}
}
