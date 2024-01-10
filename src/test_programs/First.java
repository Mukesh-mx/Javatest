package test_programs;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSamples = 0;
        int rounds = 0;

        while (totalSamples < 30) {
            System.out.print("Enter the number of leaf samples collected in round " + (rounds + 1) + ": ");
            int samplesCollected = scanner.nextInt();
            totalSamples += samplesCollected;
            rounds++;
        }

        System.out.println("Total samples collected: " + totalSamples);
        System.out.println("Number of rounds: " + rounds);
    }
}
