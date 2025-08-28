package P4;

import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        int rm = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 to convert bnd to rm and 2 vise versa: ");
        int num = scanner.nextInt();

        System.out.print("Enter the amount to be converted: $");
        double money = scanner.nextDouble();

        if(num == 1){ 
        System.out.printf("The change is $%.2f", (money*rm));
        }
        else if(num == 2){
        System.out.printf("The change is $%.2f", (money/rm));
        }
        scanner.close();
    }
}
