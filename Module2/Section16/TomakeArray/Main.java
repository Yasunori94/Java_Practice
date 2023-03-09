import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        Students[] students = {
            new Students("John", 0101, "10/10/2000", "Biology"),
            new Students("Ammy", 0102, "02/06/2000", "Literature"),
            new Students("Kyle", 0103, "08/11/2000", "Computer Science"),
            new Students("Alice", 0103, "12/23/2000", "History")
        };

        Students[] students2 = new Students[] {
            for (int i = 0; i < students.length; i++){
                students2[i] = students[i];
            }
        };

        System.out.println(students[1].name);
        
    }
}