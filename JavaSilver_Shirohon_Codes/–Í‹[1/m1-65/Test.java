class Test {
    public static void main(String[] args) {
        func(new Object[3]);
        func(new int[3]);
        func(new Integer[3]);
    }
    public static void func(Object[] obj) { }
}