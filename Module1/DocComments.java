public class DocComments {
    public static void main(String[] args) {
        
    }


    /**
     * Function name: greet
     * 
     * Inside the function:
     * 1. prints 'Hi'
     */

    public static void greet(){
        System.out.println("Hi");
    }

    /**
     * 
     * 
     * Function
     * @param name
     * @param age
     */

    public static void printText(String name, String age){
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * 
     * 
     * @param width
     * @param height
     * @return
     */

    public static double calculateArea(double width, double height){
        double area = width*height;
        return area;
    }
}
