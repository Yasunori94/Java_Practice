interface WaterBottleInterface{

    String color = "Blue";
    // 暗黙でpublic static finalとなる
    void fillUp();
    // interfaceで作られたメソッドはオーバーライドされなければならない(強制的にabstract修飾子が付与される)(protectedなどをつけるとコンパイルエラーになる)

}

public class InterfaceExample implements WaterBottleInterface{
    public static void main(String[] args) {

        System.out.println(color);
        InterfaceExample ex = new InterfaceExample();
        // InterfaceExampleクラスからインスタンスを作成（デフォルトコンストラクタ）
        ex.fillUp();
        // InterfaceExampleで作成されたインスタンス(ex)のfillUpメソッドを呼び出し
        
    }

    public void fillUp(){
        System.out.println("It is filled");
    }
}