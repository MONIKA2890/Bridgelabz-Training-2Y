
public class DateUtils {
    // Method to get month name
    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                              "July", "August", "September", "October", "November", "December"};
        
        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid month";
        }
    }
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
    
    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // Invalid month
        }
    }
    
    // Method to get the day of the week for the first day of the month using Gregorian algorithm
    public static int getFirstDayOfWeek(int month, int year) {
        // Gregorian algorithm
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (1 + x + (31 * m0) / 12) % 7;
        
        // Adjust to make Sunday = 0, Monday = 1, etc.
        return (dayOfWeek + 6) % 7;
    }
    
    // Test the methods
    public static void main(String[] args) {
        int month = 7;  // July
        int year = 2005;
        
        System.out.println("Month: " + getMonthName(month));
        System.out.println("Is leap year: " + isLeapYear(year));
        System.out.println("Days in month: " + getDaysInMonth(month, year));
        System.out.println("First day of week (0=Sunday, 1=Monday, etc.): " + getFirstDayOfWeek(month, year));
    }
}