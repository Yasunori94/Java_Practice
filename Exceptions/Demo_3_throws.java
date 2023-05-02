

class A {
    public void show() throws ClassNotFoundException{
// throwsすることで、自分はそのエラーを扱わないので、他に投げるよと宣言
// show()を呼び出している中で、例外処理をする必要がある

        // try{
            Class.forName("Calc");
            // これを記述する際は、ClassNotFoundExceptionを必須で、例外処理しなければならない
        // } catch (ClassNotFoundException e){
        //     System.out.println("Not able to find the class");
        // }
    }
}

public class Demo_3_throws{

    public static void main(String[] args) {

        // try{
        //     Class.forName("Demo");
        //     // これを記述する際は、ClassNotFoundExceptionを必須で、例外処理しなければならない
        // } catch (ClassNotFoundException e){
        //     System.out.println("Not able to find the class");
        // }

        A obj = new A();

        try {
            obj.show();
        } catch (ClassNotFoundException e){
            System.out.println("Error Occurs " + e);
        }


        
        }
}
