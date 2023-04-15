class Test {
    static final int check = 0;
    public static void main(String args[]) {
        int i = 0;
        switch(i) {
            case Test.check:
                System.out.print("case!");
            default:
                System.out.print("default!");
        }
    }
}