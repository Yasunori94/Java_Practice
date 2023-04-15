class Test {
    public static void main(String[] args) {
        int i = 9;
        do {
            System.out.print("do-");
            i++;
            continue;
        } while(i < 10);
        System.out.print("while");
    }
}