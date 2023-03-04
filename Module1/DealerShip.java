import java.util.Scanner;

public class DealerShip {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println("- Select option 'a' to buy a car");
        System.out.println("- Select option 'c' to sell a car");
        System.out.println("- For other options, type 'na'");
        String option = sc.nextLine();
        switch(option){
            case "a": 
                System.out.println("What is your budget?");
                int budget = sc.nextInt();
                if(budget >= 10000){
                    System.out.println("Some cars are available.");
                    System.out.println("\nDo you have insurance? write 'y' or 'n'");
                    sc.nextLine();
                    String insurance = sc.nextLine();
                    System.out.println("\nDo you have a driver's licence? write 'y' or 'n'");
                    String licence = sc.nextLine();
                    System.out.println("What is your credit score?");
                    int creditScore = sc.nextInt();

                    if(insurance.equals("y") && licence.equals("y") && creditScore >= 6000){
                        System.out.println("Pleasure doing business with you");
                    }
                    else{
                        System.out.println("We are sorry. You are not eligible.");
                    }
                }
                else{
                    System.out.println("There is no avalable car for less than $10000.");
                }
            break;
            case "b": System.out.println("you chose option " + option);
            break;
            case "na": System.out.println("Please call the number 00-000 and follow the instruction.");
            break;
            default: System.out.println("Invalid input");
        }
        sc.close();

    }
}
