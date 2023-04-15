
@FunctionalInterface
// アノテーションをつけることで、複数のインターフェースを実装するとエラーになる
interface A {
   void show();
//    デフォルトで、public abstract
}

public class Demo1_2 {
    public static void main(String[] args) {
        // 元のコード
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("show();");
        //     }
        // };
        // 実装したAに、メソッドを定義することで、Aをインスタンス化することが可能
        // 匿名内部クラス (Anonymous Inner Class) と呼ばれる

        A obj = () -> System.out.println("show();");
        // {}を外しても、可能
       
        obj.show();
    }
}