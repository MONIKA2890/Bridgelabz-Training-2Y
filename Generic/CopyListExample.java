import java.util.*;

public class CopyListExample {

   
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n); 
        }
    }

    public static void main(String[] args) {

        List<Integer> srcList = Arrays.asList(10, 20, 30);
        List<Number> destList = new ArrayList<>();

        copyList(destList, srcList);

        System.out.println("Source List  : " + srcList);
        System.out.println("Destination List after copy: " + destList);

       
        List<Double> srcDouble = Arrays.asList(2.5, 3.5);
        copyList(destList, srcDouble);

        System.out.println("Destination List after copying doubles: " + destList);
    }
}

