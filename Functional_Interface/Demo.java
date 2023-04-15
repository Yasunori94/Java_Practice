
@FunctionalInterface
// アノテーションをつけることで、複数のインターフェースを実装するとエラーになる
interface A {
   void show();
//    デフォルトで、public abstract
}

class B implements A{
    public void show(){
        System.out.println("show();");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        // インターフェイスAを型として、クラスBを実装
        obj.show();
    }
}