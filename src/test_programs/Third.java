package test_programs;

import java.util.Random;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        String[] numberNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in); 
        
        int randomIndex = random.nextInt(numberNames.length);
        String randomNumberName = numberNames[randomIndex];

        System.out.println("Type the number names for " + randomIndex);
        String userInput = scanner.next();

        if (userInput.trim().equalsIgnoreCase(randomNumberName)) {
            System.out.println("Correct!");
        } 
        else {
            System.out.println("Incorrect. The correct answer is: " + randomNumberName);
        }
    }
}
