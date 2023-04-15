class Test {
    public static void main(String args[]) {
        int i = 10;
        int i2 = 11;
        String str = null;
        switch(i|i2) {
            case 10: str = "Java";
            case 11: str = "Java11";
            default: str = "JavaSE11";
        }
        System.out.println(str);
    }
}