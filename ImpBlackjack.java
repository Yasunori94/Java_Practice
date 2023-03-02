import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Blackjack {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        sc.nextLine();
        //Task 3 – Wait for the user to press enter.
        
        int cardNumber = Math.min(drawRandomCard(),10);
        String yourCard = cardString(cardNumber);
        int cardNumber2 = Math.min(drawRandomCard(),10);
        String yourCard2 = cardString(cardNumber2);
        int totalCardNum = cardNumber + cardNumber2;
        
        System.out.println("\n You get: " + cardNumber + "\n" + yourCard + "\n and: " + cardNumber2 + "\n" + yourCard2);
        System.out.println("\nYour total is: " + totalCardNum);

        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>

        int dealerCardNum1 = Math.min(drawRandomCard(),10);
        String dealerCard = cardString(dealerCardNum1);
        int dealerCardNum2 = Math.min(drawRandomCard(),10);
        String dealerCard2 = cardString(dealerCardNum2);
        int totaldCardNum = dealerCardNum1+dealerCardNum2;

        System.out.println("The dealer shows :" + dealerCardNum1 +"\n" + dealerCard + "\nand has a card facing down \n" + faceDown());


        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden

        while (true){
            
            String option = hitOrStay();

            if(option.equals("stay")){
                break;
            }

            int randomCard = drawRandomCard();
            System.out.println("You get a \n" + cardString(randomCard));
            int res = Math.min(randomCard, 10);

            totalCardNum += res;
            System.out.println("your new total is " + totalCardNum);

            if(totalCardNum > 21){
                System.out.println("You are busted! Next time!");
                System.exit(0);
            }

        }

        System.out.println("Now it is dealer's turn.");
        System.out.println("The dealer shows \n" + dealerCard + "\n" + dealerCard2);
        System.out.println("Dealer's total is: " + totaldCardNum);
        System.out.println("\nPress any key for dealer to continue.");
        sc.nextLine();

        while (true){
            
            if(totaldCardNum >= 17 && totaldCardNum <= 21){
                if(totalCardNum > totaldCardNum){
                    System.out.println("You win!");
                }
                else if(totalCardNum == totaldCardNum){
                    System.out.println("Draw!");
                }
                else{
                    System.out.println("You lost!");
                }
                break;
            }

            if(totaldCardNum > 21){
                
                    System.out.println("You win!");
                break;
            }

            int randomCard = drawRandomCard();
            System.out.println("Dealer gets a \n" + cardString(randomCard));
            int res = Math.min(randomCard, 10);

            totaldCardNum += res;
            System.out.println("Dealer's new total is " + totaldCardNum);

        }


        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 

        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         sc.close();

    }

    public static int drawRandomCard() {
        
        double c = Math.random()*13 + 1;
        int cardNumber = (int)c;
        
        return cardNumber;

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */


    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    public static String hitOrStay() {
        System.out.println("Hit or Stay? (Type 'hit' or 'stay')");
        String answer = sc.nextLine();
        while (!(answer.equalsIgnoreCase("hit") || answer.equalsIgnoreCase("stay"))){
            System.out.println("Hit or Stay? (Type 'hit' or 'stay')");
            answer = sc.nextLine();
        }

        return answer;

    }
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */


    public static String cardString(int cardNumber) {
        
        switch(cardNumber){
            case 1:
            return 
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            case 2:
            return
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
            case 3:
            return
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
            case 4:
            return
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            case 5:
            return
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
            case 6:
            return
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
            case 7:
            return
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
            case 8:
            return
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
            case 9:
            return
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
            case 10:
            return
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
            case 11:
            return
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
            case 12:
            return
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
            case 13:
            return
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";
            default: 
            return "";


        }

    }


    }

