import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {

        Map<String, Double> inventory = new HashMap<>();
        
        inventory.put("Banana", 1.99);
        inventory.put("Apple", 0.99);
        inventory.put("Berry", 2.99);

        System.out.println(inventory.containsValue(1.99)); 
        
    }
}