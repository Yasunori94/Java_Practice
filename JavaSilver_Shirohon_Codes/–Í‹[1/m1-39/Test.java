class Test {
    public static void main(String args[]) {
        String str = "Hello Java SE Version 11.";
        str.substring(6);
        str = str.intern();
        System.out.println(str);
    }
}