package test_programs;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term (p): ");
        double p = scanner.nextDouble();

        if (p < 2.5) {
            System.out.println("Invalid input. Term 'p' cannot be smaller than 2.5");
        } else {
            double sum = 0;
            for (double i = 2.5; i <= p; i += 2) {
                sum += i;
            }
            System.out.println("Sum of the series up to term " + p + " is: " + sum);
        }
    }
}
