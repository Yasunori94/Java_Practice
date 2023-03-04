import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = new int[3][4];

        grades[0][0] = 72;
        // リストのアップデート

        System.out.println("\nHarry :"+ Arrays.toString(grades[0]));
        System.out.println("\nRon :"+ Arrays.toString(grades[1]));
        System.out.println("\nHermione :"+ Arrays.toString(grades[2]));

        int[][] newGrades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };
        System.out.println("\nHarry :"+ Arrays.toString(newGrades[0]));
        System.out.println("\nRon :"+ Arrays.toString(newGrades[1]));
        System.out.println("\nHermione :"+ Arrays.toString(newGrades[2]));

    }
}
