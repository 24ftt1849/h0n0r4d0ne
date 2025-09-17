package P7;

import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int count = 0;
        int prev = 0;
        
        System.out.println("Enter numbers, the input ends with 0 entered:");
        int num = scanner.nextInt();

        if(num == 0){
            System.out.println("The occurrence count of the largest number is 0");
        }
        else{
        while (num != 0) {
            prev = num;
            System.out.println("Enter numbers, the input ends with 0 entered:");
            num = scanner.nextInt();

            if(num>prev){
                if(largest == 0){
                largest = num;
                count++;
            }
                else if(num == largest){
                count++;
            }
                else if(num>largest){
                largest = num;
                count = 0;
            }
                else if(largest == 0){
                largest = num;
                count++;
            }
        }
    }
    System.out.println("The largest number is " + largest);
    System.out.println("The occurence count of the largest number is " + count);
    }
    scanner.close();
}
}
