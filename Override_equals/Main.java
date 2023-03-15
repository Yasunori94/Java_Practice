import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        City paris = new City("Paris", 2161000);
        // インスタンス
        // 1.1 City copy = paris;
        // 1.2 上記だと、copyとparisは同じオブジェクト new City("Paris", 2161000)を参照してしまう。
        // 1.3 なので、インスタンスのコピーを作成する場合は、下記のように新たにオブジェクトを作成するような設定する。
        City copy = new City(paris);

        System.out.println(paris.equals(copy));
        // 1.4 copyとparisは違う領域に存在するオブジェクトなのでfalseになってしまう。
        // 1.5 そこで、.equals()をオーバーライドする。
        copy.setPopulation(2059003);
        paris.setPopulation(3129003);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
        cities.add(new City("Venice", 261905));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("London", 8982000));
        
        System.out.println(cities.contains(paris));
        // .containsは、equalsメソッドを使って、ArrayList<City> citiesの中に、parisがあるかどうかを探し、あればtrueと返し、なければfalseを返す。
        // だが、new Cityで新たなオブジェクトとして作られてしまっているため、falseになる。

    }

}