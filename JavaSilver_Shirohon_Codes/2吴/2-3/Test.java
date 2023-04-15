public class Test {
    public static void main(String[] args) {
        int i1 = Integer.parseInt(args[0]);
        int i2;
        if(i1 > 0) {
            i2 = 10;
            int i3 = 20;
        } else {
            i2 = 0;
            int i3 = 0;
        }
        System.out.println(i2 + i3);
    }
}