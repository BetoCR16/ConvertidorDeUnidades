public class Temperatura {
    private double celsius;
    private double farenheit;

    public double DeCelsiusAFarenheit(double celsius){
        farenheit = (celsius * 9/5) + 32;
        return farenheit;
    }

    public double DeFarenheitACelsius(double farenheit){
        celsius = (farenheit - 32) * 5/9;
        return celsius;
    } 
}
