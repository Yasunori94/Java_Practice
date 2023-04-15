interface A {
    void disp();
}
interface B {
    int disp();
}
class IF implements B {
    public int disp(){
        System.out.println("interface-IF");
        return 0;
    }
}
class Test extends IF implements A,B {
    public static void main(String args[]) {
        Test t = new Test();
        t.disp();
    }
    public void disp(){
        System.out.println("interface-Test");
    }
}