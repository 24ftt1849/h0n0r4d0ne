package P4;

import java.util.Scanner;

public class ReverseOfInteger {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int number = scanner.nextInt();

        int i = number / 100; //first digit
        int y = number % 100 / 10; //second digit
        int z = number % 10; //third digit

        System.out.println("The reverse of " + i + "" + y + "" + z + " is " + z + "" + y + "" + i);

        scanner.close();
    }
}
