package recursivemethods;
    public class MathMethodsAllInOne{
    public static void main(String[] args) {

        // Math.abs() – Difference
        int marks1 = 85;
        int marks2 = 92;
        int difference = Math.abs(marks1 - marks2);
        System.out.println("Marks difference: " + difference);

        // Math.max() – Highest Value
        int scoreA = 78;
        int scoreB = 85;
        int highest = Math.max(scoreA, scoreB);
        System.out.println("Highest score: " + highest);

        // Math.min() – Lowest Value
        int price1 = 1200;
        int price2 = 950;
        int lowestPrice = Math.min(price1, price2);
        System.out.println("Lowest price: " + lowestPrice);

        // Math.sqrt() – Square Root
        double area = 144;
        double side = Math.sqrt(area);
        System.out.println("Side of square: " + side);

        // Math.pow() – Power Calculation
        double principal = 1000;
        double rate = 1.05;
        double amount = principal * Math.pow(rate, 2);
        System.out.println("Amount after 2 years: " + amount);

        // Math.random() – Random Number (OTP)
        int otp = (int)(Math.random() * 9000) + 1000;
        System.out.println("OTP: " + otp);

        // Math.round() – Rounding
        double average = 78.6;
        long roundedValue = Math.round(average);
        System.out.println("Rounded average: " + roundedValue);

        // Math.ceil() – Round Up
        double pages = 4.2;
        double totalPages = Math.ceil(pages);
        System.out.println("Total pages: " + totalPages);

        // Math.floor() – Round Down
        double discount = 199.99;
        double finalPrice = Math.floor(discount);
        System.out.println("Final price: " + finalPrice);

        // Math.log() – Logarithmic Calculation
        double value = 10;
        double result = Math.log(value);
        System.out.println("Log value: " + result);
    }
}