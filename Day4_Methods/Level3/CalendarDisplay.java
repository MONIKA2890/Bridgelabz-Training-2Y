public class CalendarDisplay {
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
    
    // Method to get the day of the week for the first day of the month (0 = Sunday, 1 = Monday, etc.)
    public static int getFirstDayOfWeek(int month, int year) {
        // Using Zeller's Congruence algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        int century = year / 100;
        year = year % 100;
        
        int dayOfWeek = (1 + (13 * (month + 1)) / 5 + year + year / 4 + century / 4 + 5 * century) % 7;
        
        // Adjust to make Sunday = 0, Monday = 1, etc.
        return (dayOfWeek + 6) % 7;
    }
    
    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                              "July", "August", "September", "October", "November", "December"};
        
        System.out.println("    " + monthNames[month] + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");
        
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfWeek = getFirstDayOfWeek(month, year);
        
        // Print leading spaces
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }
        
        // Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            
            if ((day + firstDayOfWeek) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }
    
    // Test the method
    public static void main(String[] args) {
        int month = 7;  // July
        int year = 2005;
        
        displayCalendar(month, year);
    }
}