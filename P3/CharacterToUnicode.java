package P3;

import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");

        int characterToUnicode = scanner.next().charAt(0);
        char letter = (char) characterToUnicode;
        System.out.println("The Unicode for character " + letter + " is " + characterToUnicode);

        scanner.close();
    }


    
}
