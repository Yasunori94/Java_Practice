class Test {
    public static final Test obj = new Test();
    public static void main(String args[]) {
        Test.obj.disp();
        new Test().disp();
        Test.disp();
        obj.disp();
    }
    public void disp(){
        System.out.println("Hello.");
    }
}