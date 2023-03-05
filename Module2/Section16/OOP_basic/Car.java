

// クラス（CarのBlueprintのようなもの）
public class Car {
    private String make;
    // 2.1 privateにすることで、nissan.makeのように外からアクセスできなくなる。外からアクセスする際、nissan.make = "Toyota"というように、簡単に変更されないようにするため
    private double price;
    private int year;
    private String color;
    // このクラスを使って作られた各オブジェクトが、上記のフィールドを持つことになる
    
   
        // コンストラクタ；メソッドの１種。クラスを使って、オブジェクトを作成する際に実行される。
    public Car (String make, double price, int year, String color) {
        // Carクラスを使って定義された全てのオブジェクトは、このコンストラクタのパラメーター（上記）と一致するフィールドを持つことになる。
        // では各オブジェクトのパラメーターを、そのオブジェクト自身のパラメーターとするにはどうすればよいか？
        this.make = make;
        // "this.make" はこのコンストラクタを使って作成されたオブジェクトのmakeというフィールドを指す。
        // = make の make はパラメーターを指す。
        // つまり、Car nissan = new Car("Nissan", 10000, 2020, "Green");とある場合は、
        // this.make（String make）= nissan.make（"Nissan"）ということになる。
        this.price = price;
        this.year = year;
        this.color = color;
    }


    public String getMake(){
        return make;
    }
    // 2.2 Getter: privateに設定されたフィールドにアクセス目的で作るメソッド

    public void setMake(String make){
        this.make = make;
    }
    // 3.1 Setter: privateに設定されたフィールドを変更する目的で作るメソッド
    //　入力パラメーター String makeを、フィールド（this.make）に当てはめる
    // パラメーターに、値が当てはめられた場合、this.make（Carのフィールド）と等しくするメソッドにすることで、フィールドの値が変更できる

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}

