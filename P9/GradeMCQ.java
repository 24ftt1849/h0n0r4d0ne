package P9;

import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char[][] studentAnswers = {
            {'A', 'B', 'C', 'D', 'A', 'B'}, 
            {'C', 'D', 'D', 'A', 'B', 'D'}, 
            {'D', 'D', 'A', 'B', 'B', 'A'}, 
            {'C', 'A', 'D', 'A', 'B', 'C'}  
        };
        
        char[] answerKey = new char[6];
        System.out.println("Enter the key to the MCQ:");
        String input = scanner.nextLine().toUpperCase();
        
        String[] keyParts = input.split("\\s+");
        for (int i = 0; i < 6 && i < keyParts.length; i++) {
            answerKey[i] = keyParts[i].charAt(0);
        }
        
        for (int student = 0; student < studentAnswers.length; student++) {
            int correctCount = 0;
            
            for (int question = 0; question < studentAnswers[student].length; question++) {
                if (studentAnswers[student][question] == answerKey[question]) {
                    correctCount++;
                }
            }
            
            String result = (correctCount >= 3) ? "passed" : "failed";
            
            System.out.println("Student " + student + " correct count is " + correctCount + ". Therefore, he/she " + result + " the test.");
        }
        
        scanner.close();
    }
}
