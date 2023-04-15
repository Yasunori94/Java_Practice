abstract class Test1 {
    private int id;
    public void disp() {
        System.out.print("disp() : ");
    }
    public abstract void func();
}
class Test2 extends Test1 {
    public void func() {
        System.out.print("func()");
    }
}
class Sample {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        t1.disp();
        t2.func();
    }
}