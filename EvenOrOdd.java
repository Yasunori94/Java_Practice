public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.

        evenOrOdd();
    }

    public static void evenOrOdd() {
        for(int i = 0; i < 20; i++){


            if(i%2 > 0){
                System.out.println(i + " - odd");
            }
            else{
                System.out.println(i + " - even");
            }
            
        }
    }

}
