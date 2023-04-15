import java.util.ArrayList;
import java.util.List;

class Customer {
    public int id;
    public String name;
    Customer(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return this.id + ":" + this.name;
    }
}
class Test {
    public static void main(String args[]) {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(99, "AAA"));
        customers.add(new Customer(100, "BBB"));
        customers.add(new Customer(101, "CCC"));
        customers.removeIf(s -> {if(s.id < 100){return false;}return true;});
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}