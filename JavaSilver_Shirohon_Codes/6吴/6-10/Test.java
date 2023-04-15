class Test1 {
    public Test1(int num) {
        System.out.print(num);
    }
}
class Test2 extends Test1 {
    public Test2() {
        System.out.print(1);
    }
    public Test2(int num) {
        System.out.print(2);
    }
}
class Test {
    public static void main(String[] args) {
        Test2 t2 = new Test2(3);
    }
}