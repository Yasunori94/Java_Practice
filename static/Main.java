public class Main{
    public static void main(String[] args) {
        
        Subclass harry = new Subclass(101, "Harry", 1);
        Subclass ron = new Subclass(102, "Ron", 2);
        Subclass eve = new Subclass(103, "Eve", 3);


        System.out.println(Mainclass.counter);
        // Mainclass(staticが格納されているクラス)から直接アクセスしなければならない
        // オブジェクトを作らなくても、アクセスできるクラス名.staticのメソッドやメンバ、でアクセスができる特徴がある

        harry.instruction();
        ron.instruction();
        eve.instruction();

    }
}