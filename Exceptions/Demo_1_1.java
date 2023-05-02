public class Demo_1_1{
    public static void main(String[] args) {
        
        int i = 4;
        int j = 0;

        try {
            j = 18/i;
            // クリティカルステートメントを記述
        }
        catch (ArithmeticException e){
            // 特に、ArithmeticExcceptionが起こった際の処理
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e){
            // 例外が起こった際に、キャッチし、それを処理する
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);

        System.out.println("Bye");

    }
}
