class Test {
    public static void main(String[] args) {
        try {
            func();
        } catch (RuntimeException e) {
            System.out.println("catch");
        }
    }
    public static void func() throws Exception {
        throw new RuntimeException();
    }
}