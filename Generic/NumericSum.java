import java.util.*;

public class NumericSum {

   
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;

        for (Number n : list) {
            sum += n.doubleValue();   
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30, 40);
        List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.0);

        System.out.println("Sum (Integer List): " + sumNumbers(intList));
        System.out.println("Sum (Double List): " + sumNumbers(doubleList));
    }
}

