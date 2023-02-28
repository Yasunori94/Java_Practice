import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the length");
        double length = sc.nextDouble();

        System.out.println("Type the width");
        double width = sc.nextDouble();

        calculator(length, width);
        
        sc.close();
        
    }

    public static void calculator (double length, double width){
        System.out.println("The area of the square is " + length*width);
    }
}
