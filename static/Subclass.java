public class Subclass extends Mainclass{

    private int classNum;
    
    // コンストラクタ
    public Subclass (int i, String n, int c){
        super(i, n);
        this.classNum = c;
    }

    // メソッド（オーバーライド）
    void instruction(){
        super.instruction();
        System.out.println("Your name must be " + super.getName());
        // nameはプライベートのため、チャイルドクラスからもアクセスできない
        System.out.println(" The class number is " + this.classNum);
    }

    // getter, setter
    public void setClassNum(int c) {
        this.classNum = c;        
    }
    public int getClassNum(){
        return classNum;
    }

}
