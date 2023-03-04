import java.util.Scanner;

public class ImpCounterTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

       // See detailed instructions on Learn the Part.

        System.out.print("Pick a number to count by: ");
        int counter = sc.nextInt();
        
        System.out.print("Pick a number to start counting from: ");
        int start = sc.nextInt();

        System.out.print("Pick a number to count to: ");
        int until = sc.nextInt();

        counterTool(counter, start, until);

        sc.close();
    }

    public static void counterTool(int counter, int start, int until) {
        
        for(int i = start; i <= until; i += counter){
            System.out.print(i + " ");
        }
    }

}
