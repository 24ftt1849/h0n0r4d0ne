package P6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime ld = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String ldString = ld.format(dtf);
        String userName = "Ahmad Ali";
        int password = 12345;

        System.out.print("Please enter your username: ");
        String UNInput = scanner.nextLine();

        System.out.print("Please enter your password: ");
        int UNPassword = scanner.nextInt();

        if(UNInput.equals(userName)){
            if(UNPassword == password){
                System.out.println("Welcome " + userName + ". The time is " + ldString);
            }
            else{
                System.out.println("Password does not match");
            }
        }
        else{
            System.out.println("Invalid username");
        }
        

        scanner.close();
    }
}
