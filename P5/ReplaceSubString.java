package P5;

import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String subStr = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replace = scanner.nextLine();

        System.out.println("The updated message is: ");
        System.out.println(sentence.replace(subStr, replace));

        scanner.close();
    }
}
