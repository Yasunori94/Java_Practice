package Module2.Section16;

import java.util.Arrays;

public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public static void main(String[] args) {
        Person John = new Person();

        John.name = "John"; // a String
        John.nationality = "USA"; // a String
        John.dateOfBirth = "1994/09/09";// a String
        John.passport = new String [] {"John" , "USA", "1994/09/09"};// Array that stores: {person.name, person.nationality, person.dateOfBirth}
        John.seatNumber = 5;// an Integer

        System.out.println(John.name);
        System.out.println(John.nationality);
        System.out.println(John.dateOfBirth);
        System.out.println(Arrays.toString(John.passport));
        System.out.println(John.seatNumber);
    }
}
