public class Test {
    int num = 0;
    static void add1() {
        num++;
    }
    void add2() {
        num++;
    }
    public static void main(String[] args) {
        Test t = new Test();
        Test.add1();
        t.add2();
        System.out.println(t.num);
    }
}