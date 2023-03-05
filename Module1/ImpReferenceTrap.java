import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String [] staffLastYear = {"Tammy", "Joel", "Ellie"};
        String [] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        // [Tammy, Abby, Ellie]
        System.out.println(Arrays.toString(staffThisYear));
        // [Tammy, Abby, Ellie]
        System.out.println(staffLastYear[1]);
        // Abby
        System.out.println(staffThisYear[1]);
        // Abby
    }
}
