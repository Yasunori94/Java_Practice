class Test {
    public static void func() throws Exception {
       throw new Exception("throw");
    }
    public static void main(String[] args) {
        try {
            func();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}