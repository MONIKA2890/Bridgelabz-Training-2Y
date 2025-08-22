import java.util.Scanner;
public class UniversityDiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Student Fee: ");
        double fee = sc.nextDouble();
        
        System.out.print("Enter the Discount Percent: ");
        double discountPercent = sc.nextDouble();
        
        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;
        
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
} 




