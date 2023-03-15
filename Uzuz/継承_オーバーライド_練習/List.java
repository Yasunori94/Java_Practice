public class List {
    public static void main(String[] args) {
        
        Dogs Lucky = new Dogs("Lucky", "Hudson", 1211, 1);
        Dogs John = new Dogs("John", "Yuko", 1102, 1);

        Cats Tom = new Cats("Tom", "Jerry", 1958, 1, "house cat");

        System.out.println(Lucky.getID());
        System.out.println(Lucky.toString());

        System.out.println(Tom.toString());
        Tom.setID(1988);

        System.out.println(Tom.getID());

    }
}