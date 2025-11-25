import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    // Method to reverse a queue
    public static <T> void reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        // Dequeue all elements and push into stack
        while(!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        // Pop from stack and enqueue back to queue
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}

