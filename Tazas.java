public class Tazas {
    private double tazas;
    private double cucharadas;

    public double DeTazasACucharadas(double tazas) {
        cucharadas = tazas * 16;
        return cucharadas;
    }

    public double DeCucharadasATazas(double cucharadas){
        tazas = cucharadas * 1/16;
        return tazas;
    }
}
