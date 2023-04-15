public class Test {
    public static void main(String[] args) {
        String[] ary1 = {"A", "B"};
        String[] ary2 = {"A", "B"};
        String[] ary3 = ary1;
        System.out.print((ary1 == ary2) +" : ");
        System.out.print((ary1 == ary3));
    }
}