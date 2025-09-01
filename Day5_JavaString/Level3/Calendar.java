import java.util.*;

public class Calendar {
    static String getMonthName(int month) {
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};
        return months[month-1];
    }

    static int getDaysInMonth(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month-1];
    }

    static boolean isLeapYear(int y) {
        return (y%400==0) || (y%4==0 && y%100!=0);
    }

    // Gregorian formula
    static int firstDayOfMonth(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + (31*m0)/12) % 7;
    }

    static void printCalendar(int month, int year) {
        System.out.printf("     %s %d\n", getMonthName(month), year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = firstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        for (int i = 0; i < startDay; i++) System.out.print("    ");
        
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if (((d + startDay) % 7 == 0) || d == days) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        printCalendar(m, y);
        sc.close();
    }
}

