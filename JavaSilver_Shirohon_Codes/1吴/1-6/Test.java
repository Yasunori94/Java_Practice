public class Test {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 3; i++) {
            str += (args[i] + ":");
        }
        System.out.println(str);
    }
}