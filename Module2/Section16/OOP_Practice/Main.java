public class Main {
    public static void main(String[] args) {
        
        Car nissan = new Car("Nissan", 5_000_000, 2019, "black", new String[]{"Tire", "Filter"});

        System.out.println(nissan.getMake());
        
        System.out.println(nissan.getParts());

    }
}