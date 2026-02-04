package stringsandregex;

public class SubString {
    public static void main(String[] args) {
		
		String str = "SachinTendulkar";
		System.out.println(str.substring(6));
		System.out.println(str.substring(3,6));
		
		
		int index = str.indexOf("Tend");
		System.out.println(str.substring(index));
	}
}
