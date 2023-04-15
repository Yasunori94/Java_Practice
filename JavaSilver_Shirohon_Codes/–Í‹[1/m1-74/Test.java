class Test {
    public static void main(String[] args) {
        int[] ary = {1, 2, 3};
        for(int i : ary) {
            switch(i) {
                case 1:
                    System.out.print("1");
                    continue;
                case 2:
                    System.out.print("2");
                    continue;
                default:
                    System.out.print("3");
            }
            break;
        }
    }
}