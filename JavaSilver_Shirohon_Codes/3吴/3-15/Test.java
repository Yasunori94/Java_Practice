public class Test {
    public static void main(String[] args) {
        String s = "BBB";
        final String STR = "BBB";
        switch(s) {
            case "AAA":
                System.out.println("AAA");
                break;
            case STR:
                System.out.println("BBB");
        }
    }
}