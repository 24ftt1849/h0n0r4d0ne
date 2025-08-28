package P3;

import java.util.Scanner;

public class ConvertBytesIntoBits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of byte(s) to be converted: ");
        int userInput = scanner.nextInt();

        int bits = userInput * 8;
        System.out.println(userInput + " byte(s) is " + bits + " bits.");


        scanner.close();

    }
}
