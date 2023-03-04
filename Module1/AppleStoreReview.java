public class AppleStoreReview {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;
        double priceOfApple = 0;
        int soldApples = 0;

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        priceOfApple += 0.4;

        System.out.println("One customer walked in. He bought 4 apples!");
        soldApples += 4;
        numOfCustomers++;

        System.out.println("Another customer walked in. He bought 20 apples!");
        soldApples += 20;
        numOfCustomers++;

        System.out.println("Another customer walked in. She bought 200 apples!");
        soldApples += 200;
        numOfCustomers++;

        numOfApples -= soldApples;
        profit = soldApples*priceOfApple - 0.00000000000001;

        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + "customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");

        // Compare your result to what's on Learn the Part.  
        
    }

}
