
@FunctionalInterface
// アノテーションをつけることで、複数のメソッドを実装するとエラーになる
interface A {
    int add(int i, int j);
}


public class Demo2 {
    public static void main(String[] args) {

        A obj = (i, j) -> i + j;

        // returnの場合は、returnを記述する必要はない

// 下記がもとのコード
        // A obj1 = new A() {

        //     public int add(int i, int j){
        //         return i + j;
        //     }

        // };

        int result = obj.add(5, 4);
        System.out.println(result);

    }
}