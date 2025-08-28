package P3;

import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your target amount? $");
        double amountOfMoney = scanner.nextInt();
        System.out.print("How many month(s) to reach your goal? ");
        int amountOfMonth = scanner.nextInt();
        int amountOfDays = amountOfMonth * 30;
        double savePerDay = amountOfMoney / amountOfDays;
        System.out.printf("The amount you need to save per day is $%.2f", savePerDay);

        scanner.close();
    }
}
