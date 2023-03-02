import java.util.Random;
import java.util.Scanner;

public class ImpDiceJackMyself {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Pick up 3 numbers from 1 to 6.");
        System.out.println("Num 1");
        int pickupNum1 = sc.nextInt();
        System.out.println("Num 2");
        int pickupNum2 = sc.nextInt();
        System.out.println("Num 3");
        int pickupNum3 = sc.nextInt();

        if((pickupNum1 < 1 || pickupNum1 > 6) || (pickupNum2 < 1 || pickupNum2 > 6) || (pickupNum3 < 1 || pickupNum3 > 6)){
            System.out.println("You cannot pick up the number out of 1 to 6");
            System.exit(0);
        }

        System.out.println("Okay, so you picked up " + pickupNum1 + (", ") + pickupNum2 + (", ") + pickupNum3);
        sc.close();


        System.out.println("\nnow to roll the dice!\n");
        
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        // pick pu the numbers

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
        // the result


        int sumofNum = pickupNum1+pickupNum2+pickupNum3;
        System.out.println("\nThe sum of picked number is " + sumofNum);

        int rollDiceSum = roll1+roll2+roll3;
        System.out.println("\nSum of dice num is " + rollDiceSum);

        checkWin(sumofNum, rollDiceSum);
        

    }

    public static int rollDice(){

        double randomNumber = Math.random()*6 + 1;
        // Math.random() makes 0.00000000001 to 0.999999999999 (0 ~ 1)
        // *6 makes 0.666666666666 to 5.999999999999
        // +1 makes 1.666666666666 to 6.999999999999


        return (int)randomNumber;
        // (int) makes 1 ~ 6
    }

    public static void checkWin(int sumofNum, int rollDiceSum){
        if(sumofNum > rollDiceSum && sumofNum - rollDiceSum < 3){
            System.out.println("You win!");
        }
        else{
           System.out.println("You lost");
        }
    }


}
