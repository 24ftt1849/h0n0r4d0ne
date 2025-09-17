package P7;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ran = random.nextInt(0, 1000);
        ran = ran % 3;
        System.out.print("Enter rock(0), paper(1) or scissor(2) > ");
        int userInput = scanner.nextInt();
        int rounds = 1;
        int computerScore = 0;
        int userScore = 0;

        if (ran == 0){
            System.out.print("The computer has chose rock. ");
            
        if(userInput == 0){
            System.out.println("You have chose rock. It is a draw");
        }
        else if(userInput == 1){
            System.out.println("You have chose paper. You won");
            userScore++;
        }
        else if(userInput == 2){
            System.out.println("You have chose scissor. You lost"); 
            computerScore++;           
        }
        }
        else if (ran == 1){
            System.out.println("The computer has chose paper. ");
        if(userInput == 0){
            System.out.println("You have chose rock. You lost");
            computerScore++;
        }
        else if(userInput == 1){
            System.out.println("You have chose paper. It is a draw");
        }
        else if(userInput == 2){
            System.out.println("You have chose scissor. You won");       
            userScore++;     
        }
    }
        else if (ran == 2){
            System.out.println("The computer has chose scissor. ");
        if(userInput == 0){
            System.out.println("You have chose rock. You won");
            userScore++;
        }
        else if(userInput == 1){
            System.out.println("You have chose paper. You lost");
            computerScore++;
        }
        else if(userInput == 2){
            System.out.println("You have chose scissor. It is a draw");            
        }
    }
        System.out.print("Enter y to play again: ");
        String loop = scanner.next();
        Boolean con = false;
        if(loop.equalsIgnoreCase("y")){
            con = true;
        }
        else if(loop.equalsIgnoreCase("n")){
            con = false;
        }

        while (con == true) {
            rounds++;
        System.out.print("Enter rock(0), paper(1) or scissor(2) > ");
        userInput = scanner.nextInt();
        if (ran == 0){
            System.out.print("The computer has chose rock. ");
            
        if(userInput == 0){
            System.out.println("You have chose rock. It is a draw");
        }
        else if(userInput == 1){
            System.out.println("You have chose paper. You won");
            userScore++;
        }
        else if(userInput == 2){
            System.out.println("You have chose scissor. You lost"); 
            computerScore++;           
        }
        }
        else if (ran == 1){
            System.out.println("The computer has chose paper. ");
        if(userInput == 0){
            System.out.println("You have chose rock. You lost");
            computerScore++;
        }
        else if(userInput == 1){
            System.out.println("You have chose paper. It is a draw");
        }
        else if(userInput == 2){
            System.out.println("You have chose scissor. You won");       
            userScore++;     
        }
    }
        else if (ran == 2){
            System.out.println("The computer has chose scissor. ");
        if(userInput == 0){
            System.out.println("You have chose rock. You won");
            userScore++;
        }
        else if(userInput == 1){
            System.out.println("You have chose paper. You lost");
            computerScore++;
        }
        else if(userInput == 2){
            System.out.println("You have chose scissor. It is a draw");            
        }
    }
        System.out.print("Enter y to play again: ");
        loop = scanner.next(); //for one character

        if (loop.equalsIgnoreCase("y")){
            con = true;
        }
        else if(loop.equalsIgnoreCase("n")){
            con = false;
        }
    
        if(con == false){
            System.out.println("In the total of " + rounds + " rounds, You scored " + userScore + ", Computer scored " + computerScore);
            if(userInput > computerScore){
                System.out.println("You won the game");
            }
            else if(userInput < computerScore){
                System.out.println("You lost the game");
            }
            else{
                System.out.println("It is a draw");
            }
        }
        
    }
    scanner.close();
    }
}
