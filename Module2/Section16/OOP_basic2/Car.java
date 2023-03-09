import java.util.Arrays;

// クラス（CarのBlueprintのようなもの）
public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
  
    public Car (String make, double price, int year, String color, String[] parts) {

        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
        // 2.2 String[] partsのパラメーターから受け渡された場合に、そのコピーをthis.partsとするように設定
    }

    public Car (Car source){
    // パラメーターがパスされた場合のみ、動作するCarというオブジェクト
        this.make = source.make;
        // source.makeは、パラメーターCar source（nissan）のmakeフィールド（Nissan）を参照している。
        // this.make（このコンストラクタのmakeフィールド）を source.make（nissanのmakeフィールド）にすることで、コピーが実現する。
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
        // 2.3 sourceパラメーターが受け渡された場合に、そのsourceのpartsと、sourceのパーツの長さをコピーする。
    }


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
        return Arrays.copyOf(this.parts, this.parts.length);
        // 2.4 this.partsとすると、同じフィールドを参照してしまうため、コピーを作成
    }
    public void setparts(String[] parts){
        this.parts = Arrays.copyOf(this.parts, this.parts.length);
    }
}

