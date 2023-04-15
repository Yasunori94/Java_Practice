
@FunctionalInterface
// アノテーションをつけることで、複数のインターフェースを実装するとエラーになる
interface A {
   void show();
//    デフォルトで、public abstract
}

// class B implements A{
//     public void show(){
//         System.out.println("show();");
//     }
// }

public class Demo1_0 {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("show();");
            }
        };
        // 実装したAに、メソッドを定義することで、Aをインスタンス化することが可能
        // 匿名内部クラス (Anonymous Inner Class) と呼ばれる
       
        obj.show();
    }
}