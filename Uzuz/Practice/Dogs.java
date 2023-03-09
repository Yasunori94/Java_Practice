public class Dogs{

    private String name;
    private String nameOfOwner;
    private int id;
    private static int totalNum;

    public Dogs (String n, String o, int id, int tn){
        this.name = n;
        this.nameOfOwner = o;
        this.id = id;
        totalNum += tn;
    }



    // getters and setters

    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public String getOwnerName(){
        return nameOfOwner;
    }
    public void setOwnerName(String o){
        this.nameOfOwner = o;
    }

    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }

    public static int getTotalNum(){
        return totalNum;
    }
    public static void setTotalNum(int tn){
        totalNum += tn;
    }
    
}


