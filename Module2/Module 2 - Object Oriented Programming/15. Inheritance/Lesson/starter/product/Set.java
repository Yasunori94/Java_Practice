package product;

public class Set extends Product {

    boolean discount;

    public Set (boolean discount){
        super(price, color, brand);
        this.discount = discount;
    }

    @Override
    public void wear() {
        System.out.println("Wearing my set");
    }

}
