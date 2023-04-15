class Fruits {
    protected String name;
    protected static Fruits fruits;
    Fruits(){
        fruits = this;
    }
    protected String getName(){
        return fruits.name;
    }
}
class Painapple extends Fruits {
    protected String name;
    Painapple(String name){
        super.name = name;
    }
    protected String getName(){
        return this.name;
    }
}
class Test extends Fruits {
    public static void main(String args[]) {
        Fruits fruits = new Painapple("N67-10");
        fruits.name = "Gold";
        fruits.fruits.name = "SnackPine";
        System.out.println(fruits.getName());
    }
}