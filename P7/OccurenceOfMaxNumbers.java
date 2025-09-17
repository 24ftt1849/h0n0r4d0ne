package P7;

import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int count = 0;
        int num = 0;

        System.out.print("Enter numbers, the input ends with 0 entered: ");
        num = scanner.nextInt();

        if(num == 0){
            System.out.println("The occurrence count of the largest number is 0");
        }
        else{
            largest = num;
            count++;
        do {
            System.out.print("Enter numbers, the input ends with 0 entered: ");
            num = scanner.nextInt();

                if(num>largest){
                largest = num;
                count = 1;
            }
                else if(num == largest){
                count++;
        } 
    } while(num != 0);
    System.out.println("The largest number is " + largest);
    System.out.println("The occurence count of the largest number is " + count);
    scanner.close();
    }
}
}

