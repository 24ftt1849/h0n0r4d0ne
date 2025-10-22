package P8;

import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers are there? ");
        int count = scanner.nextInt();
        
        int[] numbers = new int[count];
        
        System.out.println("Enter the " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("Enter number of left shift: ");
        int shifts = scanner.nextInt();

        if (count > 0) {
            shifts = shifts % count;
            if (shifts < 0) shifts += count; 
            
            for (int s = 0; s < shifts; s++) {
                int temp = numbers[0];
                for (int i = 0; i < count - 1; i++) {
                    numbers[i] = numbers[i + 1];
                }
                numbers[count - 1] = temp;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        scanner.close();
    }
}
