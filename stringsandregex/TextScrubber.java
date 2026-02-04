package stringsandregex;

public class TextScrubber {
       public static void main(String[] args) {

        String input = "H3ll0 W0rld! Th1s is J4v4.";

        String step1 = input.replaceAll("\\d", "*");

        String finalText = step1.replaceAll("[^a-zA-Z* ]", "");

        System.out.println(finalText);
    }
}
