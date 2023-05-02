import java.util.function.*;

public class Main{
    public static void main(String[] args) {

// T = データ型（String, Integerなど）

// Consumer<T>について
// メソッド：accept(T t)
// 引数としてtを受け取り、結果を返さずに処理を終了

        Consumer<String> consumer = (t) -> {
            System.out.println(t);
        };
        // acceptメソッドをオーバーライド

        consumer.accept("Consumer");



// Supplier<T>について
// メソッド：T get()
// 引数は受け取らずに、結果を返すメソッド


        Supplier<String> supplier = () -> {
            return "Supplier";
        };
        // get()をオーバーライドし、返すものを定義

        System.out.println(supplier.get());


// Predicate<T>について
// メソッドboolean test(T t)
// 引数を受け取り、結果としてbooleanを返す

        String dispMessage2 = "Predicate";
        Predicate<Boolean> predicate = (t) -> {
            return (boolean) t;
        };
        // test(T t)をオーバラーライド

        boolean result = predicate.test(true);
        if(result){
            System.out.println(dispMessage2);
        }

    
// Function<T,R>について
// メソッドR apply(T t)
// 引数をTの型で受け取り、結果としてRの型で結果を返す

        Function<String, String> function = (s) -> {
            String dispMessage = s + "プログラミング（Java）のお悩み解決ラボ！";
            return dispMessage;
        };
        // apply(T t)をオーバーライド

        System.out.println(function.apply("ラムダ式の解説："));



    }
}
