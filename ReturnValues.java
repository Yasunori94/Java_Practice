import java.util.Scanner;

public class ReturnValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the length");
        double length = sc.nextDouble();

        System.out.println("Type the width");
        double width = sc.nextDouble();

        sc.nextLine();
        System.out.println("What language do you prefer?");
        String language = sc.nextLine();

        System.out.println(calculator(length, width));
        System.out.println(explainArea(language));
        
        sc.close();
        
    }

    public static double calculator (double length, double width){
        double area = length*width;
        return area;
    }

    public static String explainArea(String language){
        
        switch (language){
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available.";
        }

        

    }
    

}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"
