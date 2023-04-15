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
        customers.add(new Customer(1, "AAA"));
        customers.add(new Customer(2, "BBB"));
        customers.add(new Customer(3, "CCC"));
        
        // insert code here
        for(Customer c:customers){
            System.out.println(c);
        }
    }
}