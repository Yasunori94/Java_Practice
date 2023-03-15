public class Cats extends Dogs{
    
    String catType;

    // スーパークラスからコンストラクタは継承されないため、Dogsクラスのpublic Dogs(para1, para2 ...)から新たに作成
    public Cats(String n, String o, int id, int tn, String ct){
        super(n, o, id, tn);
        this.catType = ct;
    }

    public String voice(String v){
        return "This cat's voice is:" + v;
    }

    public String toString(){
        return
        "\nName: " + getName() +
        "\nOwner: " + super.getOwnerName() +
        "\nID :" + super.getID() +
        "\nTotal number of dogs and cats: " + getTotalNum() +
        "\nThe type of the cat is: " + this.catType;
    }
}
