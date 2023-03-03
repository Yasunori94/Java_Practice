import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("\nWhat can I find you?");
        String choice = sc.nextLine();

        for (int i = 0; i < aisles.length; i++){
            if(aisles[i].equals(choice)){
                System.out.println("\nWe have that in aisle " + i);
                break;
            }
        }
        sc.close();

    }
}
