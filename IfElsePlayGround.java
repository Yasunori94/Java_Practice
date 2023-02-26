import java.util.Scanner;

public class IfElsePlayGround {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name");
        String name = sc.nextLine();

        System.out.println("Type your password");
        int password = sc.nextInt();

        if((name.equals("Yasunori") && password == 19941001) || (name.equals("Alicja") && password == 19860812)){
            System.out.println("Login Success");
        }
        else if(name.equals("root") && password == 000){
            System.out.println("Login as an admin");
        }
        else{
            System.out.println("Login Failed");
            // パスワードが整数でないと、エラーログが出る
        }

        sc.close();


    }
}
