package stringsandregex;

public class StringBufferExample {
    public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer("Java");

	        // 1. append()
	        sb.append(" Programming");
	        System.out.println("append: " + sb);

	        // 2. insert()
	        sb.insert(4, " Language");
	        System.out.println("insert: " + sb);

	        // 3. replace()
	        sb.replace(5, 13, "Core");
	        System.out.println("replace: " + sb);

	        // 4. delete()
	        sb.delete(5, 10);
	        System.out.println("delete: " + sb);

	        // 5. deleteCharAt()
	        sb.deleteCharAt(4);
	        System.out.println("deleteCharAt: " + sb);

	        // 6. reverse()
	        sb.reverse();
	        System.out.println("reverse: " + sb);

	        // Reverse back for clarity
	        sb.reverse();

	        // 7. capacity()
	        System.out.println("capacity: " + sb.capacity());

	        // 8. length()
	        System.out.println("length: " + sb.length());

	        // 9. charAt()
	        System.out.println("charAt(2): " + sb.charAt(2));

	        // 10. setCharAt()
	        sb.setCharAt(0, 'j');
	        System.out.println("setCharAt: " + sb);

	        // 11. substring()
	        System.out.println("substring(0,4): " + sb.substring(0, 4));

	        // 12. indexOf()
	        System.out.println("indexOf a: " + sb.indexOf("a"));

	        // 13. lastIndexOf()
	        System.out.println("lastIndexOf a: " + sb.lastIndexOf("a"));

	}
}
