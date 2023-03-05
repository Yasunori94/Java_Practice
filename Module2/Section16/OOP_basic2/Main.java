

public class Main {
    public static void main(String[] args) {

        String [] spareParts = new String[] {"Tires", "Keys"};
        //2.1 オブジェクトのパラメーターをセットするために、新たにArray（オブジェクト）を作った。(Car.javaとは関係ない)

        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
        // オブジェクト
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", spareParts);
        // オブジェクト
        Car nissan2 = new Car(nissan);
        // nissanというオブジェクトをパラメーター(Car source)としてセット。
                // オブジェクト「nissan」：new Carとして、各パラメーターを定義されて作られている

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getMake() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");



    }
}
