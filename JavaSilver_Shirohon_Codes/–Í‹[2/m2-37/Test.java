class Test {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        final int Z = 15;
        switch(i) {
            case 3 | 5:
                System.out.println("foo");
                break;
            case j:
                System.out.println("bar");
                break;
            case Z:
                System.out.println("baz");
        }
    }
}