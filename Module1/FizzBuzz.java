public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.

        fizzBuzz();

    }

    public static void fizzBuzz() {

        for(int i = 0; i <= 18; i++){
            
            double d = (double)i;

            if(d%3 == 0){
                String fz = " Fizz";
                System.out.println(i + fz);
            }
            else if(d%5 == 0){
                String fz = " Buzz";
                System.out.println(i + fz);
            }
            else if(d%3 == 0 && i%5 == 0){
                String fz = " FizzBuzz";
                System.out.println(i + fz);
            }

        }


    }

}
