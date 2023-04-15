
@FunctionalInterface
// アノテーションをつけることで、複数のメソッドを実装するとエラーになる
interface A {
    void show();
//    デフォルトで、public abstract
    default void show2(){
        System.out.println("show2()");
    }
}

class B implements A{
    public void show(){
        System.out.println("show();");
    }
    public void show2(){
        System.out.println("overridden show2();");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        A obj = new B();
        // インターフェイスAを型として、クラスBを実装
        obj.show();
        obj.show2();
    }
}