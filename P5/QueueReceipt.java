package P5;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        LocalDateTime ld = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String ldtString = ld.format(dtf);

        int num = random.nextInt(0, 100);
        String filename = "C:/Practical 5/QReceipt.txt";
        FileWriter fw = new FileWriter(filename);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Receipt generated. Thank you.");

        fw.write(ldtString + "\n\n");
        fw.write(" Hi " + name.toUpperCase());
        fw.write("\n\n Your Queue No is : " + num);

        scanner.close();
        fw.close();
    }
}
