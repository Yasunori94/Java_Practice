

public class Main {
    public static void main(String[] args) {
        String[] parts = new String[] {"Tired"};
        // オブジェクト「nissan」：new Carとして、各パラメーターを定義されて作られている
        Car nissan = new Car("Nissan", 10000, 2020, "Green", parts);
        // オブジェクト「dodge」
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", parts);


        nissan.setColor("Jet Black");
        dodge.setColor("Purple");
        // setterで、値を変える

        nissan.setPrice(nissan.getPrice()/2);
        // 値段をゲット（nissan.getPrice）し、２で割り、値段をセット（nissan.setPrice）する

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getMake() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");


        // 2.3 フィールドがプライベートでなければ、nissan.makeのように直接アクセスできる

        // System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
        // ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        // System.out.println("This " + dodge.make + " is worth $" + dodge.price + 
        // ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");

    }
}
