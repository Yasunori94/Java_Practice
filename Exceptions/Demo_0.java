public class Demo_0{
    public static void main(String[] args) {
        
        int i = 0;
        int j = 18/i;

        System.out.println(j);
        // この時点で、エラー（ArithmeticException: / by zero）Byeまで実行されない

        System.out.println("Bye");

    }
}