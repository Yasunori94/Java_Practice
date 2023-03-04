public class HighScore {
    public static void main(String[] args) {
        
        int [] scores = {randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum()};
        int highScore = 0;

        System.out.print("Here are the scores:");
        for(int i = 0; i < 10; i++){
            System.out.print(" " + scores[i]);
            if(scores[i]>highScore){
                highScore = scores[i];
            }
        }
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).



        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }  
    public static int randomNum() {
        double n = Math.random()*500000;
        int randomNum = (int)n;
        return randomNum;
    }  

}
