public class Test {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.print((s1 == s2) + " : ");
        System.out.print((s1.equals(s2)) + " : ");
        System.out.print(s1.intern() == s2.intern());
    }
}