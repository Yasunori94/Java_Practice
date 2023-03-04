import java.util.Arrays;

public class TDarraysLoop {
    public static void main(String[] args) {

        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        for (int i = 0; i < grades.length; i++){
            switch(i){
                case 0: System.out.print("Harry: "); break;
                case 1: System.out.print("Ron: "); break;
                case 2: System.out.print("Hermione: "); break;
            }

            for (int j = 0; j < grades[i].length; j++){
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }


        
        int[][] table = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; 
                
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[j][i]);
            }
        }

    }
}
