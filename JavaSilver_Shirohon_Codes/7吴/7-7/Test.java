class Test {
    public static void main(String[] args) {
        func(new Object());
        func(null);
    }
    public static void func(Object obj) {
        try {
            System.out.print("1");
            obj.toString();
            System.out.print("2");
        } catch(NullPointerException e) {
            System.out.print("3");
        } finally {
            System.out.print("4");
        }
        System.out.print("5 : ");
    }
}