package P9;

public class ProductRating {
    public static void main(String[] args) {
        int[][] ratings = {
            {4, 5, 4}, 
            {3, 5, 3}, 
            {4, 5, 3}, 
            {1, 2, 1}  
        };
        
        System.out.println("Rating Product Package Delivery");
        
        System.out.print("Average ");
        
        for (int j = 0; j < ratings[0].length; j++) {
            double criterionSum = 0;
            for (int i = 0; i < ratings.length; i++) {
                criterionSum += ratings[i][j];
            }
            double criterionAverage = criterionSum / ratings.length;
            System.out.printf("%.2f ", criterionAverage);
        }
        System.out.println();
        
        for (int i = 0; i < ratings.length; i++) {
            double customerSum = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                customerSum += ratings[i][j];
            }
            double customerAverage = customerSum / ratings[i].length;
            System.out.printf("Customer %d provide the average rating %.2f%n", (i + 1), customerAverage);
        }
    }
}
