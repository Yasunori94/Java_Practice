package product;

public abstract class Product {
    // abstractをつけると、インスタンス化できない。
    // ShirtかPantsだけをインスタンス化し、そのスーパークラスはインスタンス化する必要がない場合、abstractをつける
    private double price;
    private String color;
    private String brand;


    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void fold(){
        System.out.println("Folding my " + this.brand + " " + this.getClass().getSimpleName());
    }

    public abstract void wear();
        // abstractメソッドは、abstractクラス内でしか作れない
        // また、abstractは、サブクラスで具現化する目的があるので、body{}がつかない。
        // abstractメソッドは、サブクラスでオーバーライドされる必要がある。

}
