interface Info {
    int num = 100;
    void func();
}
class Test implements Info {
    public void func() {
        System.out.println("func()");
    }
}
class Sample {
    public static void main(String[] args) {
        Test t = new Test();
        // insert code here
    }
}