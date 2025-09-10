package P6;

import java.util.Random;
import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int ran1 = random.nextInt(0, 100);
        int ran2 = random.nextInt(0, 100);
        int ran3 = random.nextInt(0, 100);
        int ran4 = random.nextInt(0, 100);

        int totalNum = ran1 + ran2 + ran3 + ran4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the sum of " + ran1 + " + " + ran2 + " + " + ran3 + " + " + ran4 + "?");
        int userInput = scanner.nextInt();

        if(userInput == totalNum){
            System.out.println("Well done, you are correct!");
        }
        else{
            System.out.println("Nice try, the sum should be " + totalNum);
        }

        scanner.close();
    }
}
