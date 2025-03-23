package test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // Read a string (single word)
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("You entered: " + word);

        // Read a full line
        scanner.nextLine();  // Consume the newline left-over
        System.out.print("Enter a full line: ");
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);

        scanner.close();
    }
}
