import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
            .filter(price -> {
                return price > 100;
                // もし、priceが100より大きければ、trueと返すフィルターを作成
            })
            .map(price -> {
                return price - 20;
                // trueになったpriceをmap化して、-20して返す
            })
            .sorted((right,left) -> {
                return right.compareTo(left);
                // map化された値を、小さい順に右から並べる
            })
            .map(price -> {
                return "$" + price;
                // "$"を加えてmap化
            })
            .forEach(price -> 
            System.out.println(price)
                // プリントアウトする
            );

    }
}