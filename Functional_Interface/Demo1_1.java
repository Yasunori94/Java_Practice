
@FunctionalInterface
// アノテーションをつけることで、複数のインターフェースを実装するとエラーになる
interface A {
   void show();
//    デフォルトで、public abstract
}

public class Demo1_1 {
    public static void main(String[] args) {
        // 元のコード
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("show();");
        //     }
        // };
        // 実装したAに、メソッドを定義することで、Aをインスタンス化することが可能
        // 匿名内部クラス (Anonymous Inner Class) と呼ばれる

        A obj = () -> {
                System.out.println("show();");
            };
        // 関数型インターフェース（抽象メソッドを１つしか持たないインターフェース）から、ラムダ式が生成可能
        // {}内は、show();をオーバーライドしている
        // ->には、new A(){
        //     public void show()が含まれる
       
        obj.show();
    }
}