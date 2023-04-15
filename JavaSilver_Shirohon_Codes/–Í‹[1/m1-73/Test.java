class Test {
    static int no = 10;
    Test(int no){
        this.no = no;
    }
    int getNo(){
        return this.no;
    }
    public static void main(String args[]){
        Test obj = new Test(20);
        System.out.println(Test.no);
    }
}