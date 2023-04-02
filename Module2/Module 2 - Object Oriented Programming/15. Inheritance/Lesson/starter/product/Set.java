package product;

public class Set extends Product {

    boolean discount;

    public Set (double price, String color, String brand, boolean discount){
        super(price, color, brand);
        this.discount = discount;
    }
    // 抽象クラスProductに引数を含んだコンストラクタがある場合、それを明示的に定義する必要がある。

    @Override
    public void wear() {
        System.out.println("Wearing my set");
    }

}
