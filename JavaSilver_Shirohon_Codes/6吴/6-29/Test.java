@FunctionalInterface
interface Sample {
    public String func(String s1, String s2);
}
class Test {
    public static void main(String[] args) {
        Sample sp = new Sample() {
            @Override
            public String func(String s1, String s2) {
                return s1 + " " + s2;
            }
        };
        System.out.println(sp.func(args[0], args[1]));
    }
}