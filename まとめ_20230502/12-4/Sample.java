import java.util.function.*;
// 関数型インターフェースのインポート


public class Sample{

/*     void sample(){
        final int i = 0;
        Supplier<Integer> foo = () -> 
        i; iという変数をセットして
        i++; iに１を足すという処理

        System.out.println(foo.get());
    }
*/
// 

    void sample(){
        int i = 0;
        Supplier<Integer> foo = () -> 
        i;
        System.out.println(foo.get());
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.sample();
    }

}