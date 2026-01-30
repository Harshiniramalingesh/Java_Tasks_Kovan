package controlstatements;

public class SwitchStatements {
    public static void main(String[] args) {
		int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println(dayName);
        
        int month = 7;
        String monthName = " ";
        switch(month) {
        case 1 -> monthName = "January";
        case 2 -> monthName = "February";
        case 3 -> monthName = "March";
        case 4 -> monthName = "April";
        case 5 -> monthName = "May";
        case 6 -> monthName = "June";
        case 7 -> monthName = "July";
        case 8 -> monthName = "August";
        case 9 -> monthName = "September";
        case 10 -> monthName = "October";
        case 11 -> monthName = "November";
        case 12 -> monthName = "December";
        }
        
        System.out.println(monthName);
	}
}
