package test_programs;

public class Second {
    public static void main(String[] args) {
        String inputString = "YourStringHere"; // Replace with the actual string
        int vowels = 0;
        int consonants = 0;

        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); ++i) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++vowels;
                } else {
                    ++consonants;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
