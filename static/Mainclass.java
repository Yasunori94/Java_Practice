public abstract class Mainclass {
    
    public static int counter;
    private int id;
    private String name;
    
    
    // コンストラクタ
    public Mainclass (int i, String n){
        this.id = i;
        this.name = n;
        counter++;
    }

    // メソッド

    // getter, setter

    public int getID(){
        return this.id;
    }

    public void setID(int i){
        this.id = i;
    }

    public String getName(){
        return this.name;
    }

    public void setID(String n){
        this.name = n;
    }

    void instruction(){
        System.out.println("Please enter the class room");
    }

}
