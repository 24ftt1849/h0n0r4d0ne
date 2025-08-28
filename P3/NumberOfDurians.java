package P3;

import java.util.Scanner;

public class NumberOfDurians {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Each durian cost $15.75");
        System.out.print("How much money do you have? $");
        double money = scanner.nextDouble();

        double totalOfDurian = money / 15.75;
        int total = (int) totalOfDurian; 

        System.out.println("The number of durian(s) you can buy is " + total);
        scanner.close();

    }
}
