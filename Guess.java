import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int userNum = sc.nextInt();

        double secretNum = Math.random()*5 + 1;
        secretNum = (int)secretNum;

       while(userNum!=secretNum){
        System.out.print("Guess Again: ");
        userNum = sc.nextInt();
       }

       System.out.println("You got it!");
       
       //See Learn the Part for detailed instructions.
        
        sc.close();
    }

}
