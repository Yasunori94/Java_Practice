class Test {
    public static void main(String args[]) {
        var str = new String("Hello");
        System.out.print(str == "Hello");
        str = str.intern();
        System.out.print(str == "Hello");
    }
}