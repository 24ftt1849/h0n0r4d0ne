package P7;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int term0=0; 
        int term1=1;
        int tempTerm = 0;

        System.out.print("Please enter the term : ");
        int userInput = scanner.nextInt();

        if(userInput == 0){
            System.out.println("At term " + userInput + " the number is " + term0);
        }
        else if(userInput == 1){
            System.out.println("At term " + userInput + " the number is " + term1);
        }
        else{
        int numberChosen = userInput;
        while (userInput >= 2) {
            tempTerm = term1 + term0; 
            term0 = term1; 
            term1 = tempTerm; 
            
            userInput--;
        }
        System.out.println("At term " + numberChosen + " the number is " + tempTerm);
    }
        scanner.close();
    }        

    }

