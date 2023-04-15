class Test {
    public static void main(String args[]) {
        Sub obj = new Sub();
    }
}
class Super {
    Super() {System.out.print("Super");}
}
class Sub extends Super{
    Sub() {
        super();this(10);
        System.out.print("Sub");
    }
    Sub(int x){
        super();
        System.out.print("Sub-int");
    }
}