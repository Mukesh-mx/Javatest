package test_programs;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();
        String message;

        switch (score) {
            case 0,1,2,3:
                message = "When can we meet you to explain the roles and responsibilities of a resident?";
                break;
            case 4,5,6,7:
                message = "You have taken a step in the right direction!";
                break;
            case 8,9,10:
                message = "Thank you for going the extra mile! Would you be interested in training others?";
                break;
            default:
                message = "Invalid score entered.";
                break;
        }

        System.out.println("Message: " + message);
    }
}
