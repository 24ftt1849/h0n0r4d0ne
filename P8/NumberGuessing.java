package P8;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = (int)(Math.random() * numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
        
        int chances = 10;
        boolean won = false;
        
        while (chances > 0 && !won) {
            System.out.println("Guess 4 numbers (no duplicates):");
            
            int[] userGuess = new int[4];
            for (int i = 0; i < 4; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                userGuess[i] = scanner.nextInt();
            }
            
            int correctCount = 0;
            for (int i = 0; i < 4; i++) {
                if (userGuess[i] == numbers[i]) {
                    correctCount++;
                }
            }
            
            if (correctCount == 4) {
                won = true;
                System.out.println("You won! You got the actual number!");
                break;
            }
            
            chances--;

            System.out.println("You have score " + correctCount + " out of the 4 numbers. You have " + chances + " chances left.");
        }
        
        if (!won) {
            System.out.print("The actual number is ");
            for (int i = 0; i < 4; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.print(" You lose.");
        }
        
        scanner.close();
    }
}
