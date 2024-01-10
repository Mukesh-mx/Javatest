package test_programs;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();
        double totalCharge = 0;

        if (unitsConsumed <= 100) {
            totalCharge = unitsConsumed * 2.00;
        } else if (unitsConsumed <= 300) {
            totalCharge = 100 * 2.00 + (unitsConsumed - 100) * 3.00;
        } else {
            totalCharge = 100 * 2.00 + 200 * 3.00 + (unitsConsumed - 300) * 5.00;
            totalCharge += totalCharge * 0.025; 
        }

        System.out.println("Total charge to be paid: Rs " + totalCharge);
    }
}
