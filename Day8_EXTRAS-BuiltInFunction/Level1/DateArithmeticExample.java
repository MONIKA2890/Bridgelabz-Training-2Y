import java.time.*;

public class DateArithmeticExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date  : " + result);
    }
}

