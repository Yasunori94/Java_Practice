import java.util.Arrays;

public class ImpArrayWeather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);
        // 一旦、メソッドを当てはめる必要がある
        
        System.out.println(Arrays.toString(fahrenheit));

    }

    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        for(int i = 0; i < fahrenheit.length; i++){
            fahrenheit[i] = fahrenheit[i]/5*9 + 32;
        }
        return fahrenheit;


    }

}
