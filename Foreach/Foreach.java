import java.lang.reflect.Array;
import java.util.ArrayList;

public class Foreach {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Tom");
        students.add("Mully");
        students.add("Beth");
        students.add("Jessy");


        for (String s : students){
            System.out.println(s);
        }

        int[] id = {1010,1011,1012,1013};

        for (int i : id){
            System.out.println(i);
        }


    }
}