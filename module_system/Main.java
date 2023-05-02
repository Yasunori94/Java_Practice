import java.lang.Math;
import java.util.*;



public class Main {

    public int randomNumCreator(){

        int roundedNum = 0;
    
        double randomNum = (Math.random()*10+1);
        roundedNum = (int)randomNum;
    
        while(roundedNum > 5){
         
        randomNum = (Math.random()*10+1);
        roundedNum = (int)randomNum;
            
        }
    
        // --------------------
        
        return roundedNum;
    
        }

    public List<Integer> dupCheck(){
        Main main = new Main();
        Main main2 = new Main();
        Main main3 = new Main();
        Main main4 = new Main();
        Main main5 = new Main();

        int num1 = main.randomNumCreator();
        int num2 = main2.randomNumCreator();
        int num3 = main3.randomNumCreator();
        int num4 = main4.randomNumCreator();
        int num5 = main5.randomNumCreator();

        while(
        num1 == num2 ||
        num1 == num3 ||
        num1 == num4 ||
        num1 == num5 ||

        num2 == num1 ||
        num2 == num3 ||
        num2 == num4 ||
        num2 == num5 ||

        num3 == num1 ||
        num3 == num2 ||
        num3 == num4 ||
        num3 == num5 ||

        num4 == num1 ||
        num4 == num2 ||
        num4 == num3 ||
        num4 == num5 ||

        num5 == num1 ||
        num5 == num3 ||
        num5 == num4 ||
        num5 == num2

        ){
            num1 = main.randomNumCreator();
            num2 = main2.randomNumCreator();
            num3 = main3.randomNumCreator();
            num4 = main4.randomNumCreator();
            num5 = main5.randomNumCreator();
        }

        num1 = main.randomNumCreator();
        num2 = main.randomNumCreator();
        num3 = main.randomNumCreator();
        num4 = main.randomNumCreator();
        num5 = main.randomNumCreator();

        List<Integer> list = List.of(num1, num2, num3, num4, num5);
        return list;

    }

    public static void main(String[] args) {

        Main main = new Main();
        
        String name1 = "Yasunori";
        String name2 = "Alicja";
        String name3 = "Ro-san";

        // rundom Number Generator (Between 1 to 5)

        int num1 = main.dupCheck().get(0);
        int num2 = main.dupCheck().get(1);
        int num3 = main.dupCheck().get(2);
        int num4 = main.dupCheck().get(3);
        int num5 = main.dupCheck().get(4);


        for (int i = 1; i <= 5; i++){

            switch(i){

                case 1: System.out.println(i + ": " + name2 + ". Number is: " + num1); break;

                case 2: System.out.println(i + ": " + name1 + ". Number is: " + num2); break;

                case 3: System.out.println(i + ": " + name3 + ". Number is: " + num3); break;

                case 4: System.out.println(i + ": " + name3 + ". Number is: " + num4); break;

                case 5: System.out.println(i + ": " + name3 + ". Number is: " + num5); break;


            }

        }


    }
}
