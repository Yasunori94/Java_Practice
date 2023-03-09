import java.util.Arrays;

// クラス
public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
  
    // コンストラクタ
    public Car (String make, double price, int year, String color, String[] parts) {

        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);

    }

    public void drive(){
        System.out.println("You bought the beautiful" + this.make );
    }

    // コンストラクタ
    public Car (Car source){

        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = source.parts;
    }
    // コンストラクタ
    public String toString(){
        return "Make: " + this.make + ".\n" 
        +  "Price: " + this.price + ".\n"
        +  "Year: " + this.year + ".\n"
        +  "Color: " + this.color + ".\n"
        +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
    // public String toStrong()を設定することで、Main.javaでSystem.out.println(nissan(オブジェクト));が、{}を表示するようになる。
    // デフォルトで、Car@~~~~と表示されるものを書き換えた形になる（オーバーライド）

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }

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

    public String[] getParts(){
        return parts;
    }
    public void setparts(String[] parts){
        this.parts = parts;
    }
}

