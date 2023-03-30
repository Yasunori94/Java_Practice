import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // *******************forEach*******************
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
        usernames.stream()
            .map(u -> u.toUpperCase())
            .forEach(u -> System.out.println(u));

        // *******************toList*******************
        List<String> upperUsernames = usernames.stream()
            .map(u -> u.toUpperCase())
            .toList();
        // usernamesをupper caseにし、リスト化する


        // *******************reduce*******************

        List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
        Double totalEarnings = earnings.stream().reduce(null, null)


        // *******************reduce*******************

        List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 2.00);
        // Double fundsRemaining = 
        
        System.out.println("\nYou still have $<fundsRemaining");
       
       
        // *******************findFirst*******************
        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
        System.out.print("\nDo you guys sell coffee? ");

        //System.out.println("Sure we do! No we don't!");
        
        
        // *******************count*******************        
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
        System.out.println("\nHow many times does the number 1 repeat?");
        // int count = 

        System.out.println("The number 1 repeats <count> times");
        
    }   
    
}

