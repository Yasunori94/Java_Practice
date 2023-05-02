public class Demo_2_throw{
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if (j==0){
                throw new ArithmeticException();
                // jが0の場合、ArithmeticExceptionで、エラーを生成する
            }
        }
        catch (ArithmeticException e){
            // ArithmeticExcceptionが起こった際の処理
            j = 18/1;
            System.out.println("Default output is here " + e);
        }
        catch (Exception e){
            // 例外が起こった際に、キャッチし、それを処理する
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);

        System.out.println("Bye");

    }
}
