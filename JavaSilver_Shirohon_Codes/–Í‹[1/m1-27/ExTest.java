class Test {
    private int no;
    private void add() {
        no++;
    }
    public void disp() {
        System.out.print(no);
    }
}
class ExTest extends Test {
    public void func() {
        super.add();
    }
    public static void main(String[] args) {
        ExTest et = new ExTest();
        et.func();
        et.disp();
    }
}