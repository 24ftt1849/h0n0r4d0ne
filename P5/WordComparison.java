package P5;

import java.util.Scanner;

public class WordComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        System.out.print("Are both words the same? " + word1.equalsIgnoreCase(word2));






        scanner.close();
    }
}
