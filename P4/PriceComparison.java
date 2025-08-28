package P4;

import java.util.Scanner;

public class PriceComparison {
    
public static void main(String[] args) {
    double firstPrice;
    int firstWeight;
    double secondPrice;
    int secondWeight;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the price of the 1st package: $");
    firstPrice = scanner.nextDouble();

    System.out.print("Enter the weight of the 1st package in gram: ");
    firstWeight = scanner.nextInt();

    System.out.print("Enter the price of the 2nd package: $");
    secondPrice = scanner.nextDouble();

    System.out.print("Enter the weight of the 2nd package in gram: ");
    secondWeight = scanner.nextInt();

    double divide1 = firstWeight / firstPrice;
    double divide2 = secondWeight / secondPrice;

    if (divide1 > divide2){
        System.out.println("It is worth more to buy the 1st package");
    }
    else if (divide2 > divide1){
         System.out.println("It is worth more to buy the 2nd package");
    }



    scanner.close();
}

}
