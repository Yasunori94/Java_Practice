public class JumpDemo{
    public static void main(String[] args) {
        
        for(int i = 1; i <= 10; i++){

             // 7を出力したくない場合の処理
            if(i==7){
                continue;
            // forの処理文の残りをスキップする
            }

            System.out.println("value is " + i);
        }


        System.out.println("--------------------");


        for(int i = 1; i <= 10; i++){

           if(i>5){
               break;
           // 5よりも大きくなれば、forループを抜け出す（forループの処理を行わない）
           }

           System.out.println("value is " + i);
       }

    }
}