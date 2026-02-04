package stringsandregex;

public class StringAllMethods {
    public static void main(String[] args) {
		 String s1 = "Java Programming";
	        String s2 = "JAva programming";
	        String s3 = "  Hello World  ";
	        String s4 = "Java";

	        // 1. length()
	        System.out.println("Length: " + s1.length());

	        // 2. charAt()
	        System.out.println("charAt(2): " + s1.charAt(2));

	        // 3. substring()
	        System.out.println("substring(5): " + s1.substring(5));
	        System.out.println("substring(0,4): " + s1.substring(0, 4));

	        // 4. equals()
	        System.out.println("equals: " + s1.equals(s2));

	        // 5. equalsIgnoreCase()
	        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

	        // 6. compareTo()
	        System.out.println("compareTo: " + s1.compareTo(s2));

	        // 7. compareToIgnoreCase()
	        System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s2));

	        // 8. toUpperCase()
	        System.out.println("toUpperCase: " + s1.toUpperCase());

	        // 9. toLowerCase()
	        System.out.println("toLowerCase: " + s1.toLowerCase());

	        // 10. trim()
	        System.out.println("trim: " + s3.trim());

	        // 11. startsWith()
	        System.out.println("startsWith Java: " + s1.startsWith("Java"));

	        // 12. endsWith()
	        System.out.println("endsWith ing: " + s1.endsWith("ing"));

	        // 13. contains()
	        System.out.println("contains Program: " + s1.contains("Program"));

	        // 14. indexOf()
	        System.out.println("indexOf a: " + s1.indexOf('a'));
	        System.out.println("indexOf Programming: " + s1.indexOf("Programming"));

	        // 15. lastIndexOf()
	        System.out.println("lastIndexOf a: " + s1.lastIndexOf('a'));

	        // 16. replace()
	        System.out.println("replace: " + s1.replace("Java", "Python"));

	        // 17. replaceAll()
	        System.out.println("replaceAll: " + s1.replaceAll("a", "@"));

	        // 18. replaceFirst()
	        System.out.println("replaceFirst: " + s1.replaceFirst("a", "@"));

	        // 19. isEmpty()
	        String empty = "";
	        System.out.println("isEmpty: " + empty.isEmpty());

	        // 20. isBlank()  (Java 11+)
	        String blank = "   ";
	        System.out.println("isBlank: " + blank.isBlank());

	        // 21. concat()
	        System.out.println("concat: " + s4.concat(" Language"));

	        // 22. join()
	        String joined = String.join("-", "Java", "Python", "C++");
	        System.out.println("join: " + joined);

	        // 23. split()
	        String[] words = s1.split(" ");
	        System.out.println("split:");
	        for (String w : words) {
	            System.out.println(w);
	        }

	        // 24. toCharArray()
	        char[] chars = s4.toCharArray();
	        System.out.println("toCharArray:");
	        for (char c : chars) {
	            System.out.println(c);
	        }
	}
}
