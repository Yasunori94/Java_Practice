public class Main {
    public static void main(String[] args) {
        Int myInt = new A();
        myInt.disp(); // デフォルトメソッドが呼び出されます
        // ただし、Aクラスでデフォルトメソッドがオーバーライドされていれば、Aクラスのデフォルトメソッドが呼び出される
    }
}