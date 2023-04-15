public class Demo_Alicja {

    String name = "Alicja";
    String haircolor = "blonde";
    int height = 173;
    String eyecolor = "Green";

    public void dance (){
        System.out.println("Move hands");
    }

    public void moveHands (int times){
        System.out.println("Moving Hands " + times + " times");
    }


    public static void main(String[] args) {

        Demo_Alicja Alicja = new Demo_Alicja();
        Alicja.moveHands(3);
        Alicja.moveHands(5);
        
    }
}

