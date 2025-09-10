package P6;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ran = random.nextInt(0, 1000);
        ran = ran % 3;
        System.out.print("Enter rock(0), paper(1) or scissor(2) > ");
        int userInput = scanner.nextInt();

        if (ran == 0){
            System.out.print("The computer has chose rock. ");
        if(userInput == 0){
            System.out.println("You have chose rock. It is a draw");
        }
        else if(userInput == 1){
            System.out.println("You have chose paper. You won");
        }
        else if(userInput == 2){
            System.out.println("You have chose scissor. You lost");            
        }
        }
        else if (ran == 1){
            System.out.print("The computer has chose paper. ");
        if(userInput == 0){
            System.out.print("You have chose rock. You lost");
        }
        else if(userInput == 1){
            System.out.print("You have chose paper. It is a draw");
        }
        else if(userInput == 2){
            System.out.print("You have chose scissor. You won");            
        }
    }
        else if (ran == 2){
            System.out.print("The computer has chose scissor. ");
        if(userInput == 0){
            System.out.print("You have chose rock. You won");
        }
        else if(userInput == 1){
            System.out.print("You have chose paper. You lost");
        }
        else if(userInput == 2){
            System.out.print("You have chose scissor. It is a draw");            
        }
    }
        scanner.close();
    }
}
