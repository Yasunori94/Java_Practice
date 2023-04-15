public class Test {
    int ans;
    public void add(int i) {
        ans += i;
    }
    public static void main(String[] args) {
        int num1 = 10;
        Test t1 = new Test();
        t1.add(100);
        int num2 = num1;
        num2 += 20;
        Test t2 = t1;
        t2.add(200);
        System.out.print(num1 + " : ");
        System.out.print(t1.ans);
    }
}