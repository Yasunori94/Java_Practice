 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 

        person.setSeatNumber(10);

        System.out.println(person.getName());
        System.out.println(person.getNationality());
        System.out.println(person.dateOfBirth());
        System.out.println(person.getSeatNumber());
        

    }
  
  
}
