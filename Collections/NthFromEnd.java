import java.util.*;

public class NthFromEnd {
    public static <T> T getNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        for(int i = 0; i < n; i++) first.next();

        while(first.hasNext()){
            first.next();
            second.next();
        }
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(getNthFromEnd(list, 2));
    }
}

