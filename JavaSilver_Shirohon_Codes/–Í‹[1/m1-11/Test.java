class Test {
    int no;
    public static void main(String args[]) {
        int no = 100;
        Test obj = new Test(no);
        no = obj.noMethod(no);
        System.out.println(no);
    }
    int noMethod(int x){
        int no = 300;
        return this.no;
    }
    Test(int x){
        int no = x + 100;
    }
}