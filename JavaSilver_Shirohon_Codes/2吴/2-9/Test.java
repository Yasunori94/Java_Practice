public class Test {
    static String num1 = "100";
    static int func(var v) {
        var f = 0;
        String num1 = v;
        f = Integer.parseInt(num1);
        return f;
    }
    public static void main(String[] args) {
        var v1 = func("200");
        System.out.println(v1);
    }
}