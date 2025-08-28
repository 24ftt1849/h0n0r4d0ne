package P5;

import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 5 letters word: ");
        String word = scanner.nextLine();

        
        System.out.println("The reverse of the word " + word + " is " + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));




        scanner.close();
    }
}
