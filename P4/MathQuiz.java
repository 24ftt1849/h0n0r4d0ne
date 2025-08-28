package P4;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(1, 100);
        int num2 = random.nextInt(1, 100);
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        int totalNum = num1 + num2;

        if (userInput == totalNum){
            System.out.println(num1 + " + " + num2 + " = " + totalNum + " is true");
        }
        else{
            System.out.println(num1 + " + " + num2 + " = " + userInput + " is false");
        }
        

        scanner.close();
    }
    
}
