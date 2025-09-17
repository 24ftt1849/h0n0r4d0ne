package P7;

import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNum = 0; //total sum
        int posNum = 0;
        int negNum = 0;
        int numCount = 0;
        double average = 0;

        while (true) {
        System.out.println("Enter an integer, the input ends if it is 0;");
        int num = scanner.nextInt();
        double totalNum1 = (double) totalNum;
        double numCount1 = (double) numCount;
        numCount++;
        totalNum+= num;

        if(num > 0){
            posNum++;
        }
        else if(num < 0){
            negNum++;
        }
        else if (num == 0 && numCount == 1){
        System.out.println("No number is entered except for 0 to end the program");
        break;
        }
        else{

            average = totalNum1/numCount1;
            System.out.println("The number of positive is " + posNum);
            System.out.println("The number of positive is " + negNum);
            System.out.println("The total is " + totalNum);
            System.out.printf("The average is %.2f", average);
            break;
        }
        }
        scanner.close();
    }
    }


