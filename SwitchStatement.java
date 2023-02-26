import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the month");
        int month = sc.nextInt();

        sc.close();

        switch(month){
            case 1:System.out.println("Jan");
            break;

            case 2:System.out.println("Feb");
            break;

            case 3:System.out.println("Mar");
            break;

            case 4:System.out.println("Apr");
            break;

            default:System.out.println("Enter a valid month");
            break;
            

        }

    }
}
