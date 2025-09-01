import java.util.Scanner;

public class AgeVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // Taking input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid age entered!");
            } else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }
        sc.close();
    }
}

