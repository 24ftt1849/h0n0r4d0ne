package P6;

import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int guess = 0;

        System.out.println("Is your birth month in Set 1?");
        System.out.println("1 3 5 7 9 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int userAns = scanner.nextInt();

        if (userAns == 1){
            guess = guess + 1;
        }

        System.out.println("Is your birth month in Set 2?");
        System.out.println("2 3 6 7 10 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int userAns2 = scanner.nextInt();

        if (userAns2 == 1){
            guess = guess + 2;
        }

        System.out.println("Is your birth month in Set 3?");
        System.out.println("4 5 6 7 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int userAns3 = scanner.nextInt();

        if (userAns3 == 1){
            guess = guess + 4;
        }

        System.out.println("Is your birth month in Set 4?");
        System.out.println("8 9 10 11 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int userAns4 = scanner.nextInt();

        if (userAns4 == 1){
            guess = guess + 8;  
        }



        if (guess == 1){
            System.out.println("You are born in January");
        }
        else if(guess == 2){
            System.out.println("You are born in February");
        }
        else if(guess == 3){
            System.out.println("You are born in March");
        }
        else if(guess == 4){
            System.out.println("You are born in April");
        }
        else if(guess == 5){
            System.out.println("You are born in May");
        }
        else if(guess == 6){
            System.out.println("You are born in June");
        }
        else if(guess == 7){
            System.out.println("You are born in July");
        }
        else if(guess == 8){
            System.out.println("You are born in August");
        }
        else if(guess == 9){
            System.out.println("You are born in September");
        }
        else if(guess == 10){
            System.out.println("You are born in October");
        }
        else if(guess == 11){
            System.out.println("You are born in November");
        }
        else if(guess == 12){
            System.out.println("You are born in December");
        }

        scanner.close();
    }
}
