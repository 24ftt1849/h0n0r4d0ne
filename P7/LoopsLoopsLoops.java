package P7;

public class LoopsLoopsLoops {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 50;

        System.out.println("Below is generated using while loop:"); //check first, then execute the code
        while (number1 < 21) {
            System.out.print(number1 + " ");
            number1++;
        }

        System.out.println("\nBelow is generated using do while loop:"); //execute the code first, then checks
        do {
            System.out.print(number2 + " ");
            number2--;
        }while(number2 > 34);
        
        System.out.println("\nBelow is generated using for loop:");
        for(char a = 'a'; a <= 'z'; a++){
            System.out.print((char)a + " ");
        }
    }
}

