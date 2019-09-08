public class Convertidor {
    private Temperatura temperatura;
    private Tazas tazas;
    private Masa masa;

    private int eleccion;
    private double valor;

    public Convertidor(){
        masa = new Masa();
        tazas = new Tazas();
        temperatura = new Temperatura();
        valor = 0;
        eleccion = 0;
    }

    public String ConversionA(){
        String convierteA = "";
        switch(eleccion){
            case 1:
                convierteA = " TAZAS";
            break;
            case 2:
                convierteA = " CUCHARADAS";
            break;
            case 3:
                convierteA = " GRAMOS";
            break;
            case 4:
                convierteA = " ONZAS";
            break;
            case 5:
                convierteA = " GRADOS FARENHEIT";
            break;
            case 6:
                convierteA = " GRADOS CELSIUS";
            break;
        }
        return convierteA;
    }

    public double convertir(){
        double resultado = 0;
        switch(eleccion){
            case 1:
                resultado = tazas.DeCucharadasATazas(valor);
            break;
            case 2:
                resultado = tazas.DeTazasACucharadas(valor);
            break;
            case 3:
                resultado = masa.DeOnzasAGramos(valor);
            break;
            case 4:
                resultado = masa.DeGramosAOnzas(valor);
            break;
            case 5:
                resultado = temperatura.DeCelsiusAFarenheit(valor);
            break;
            case 6:
                resultado = temperatura.DeFarenheitACelsius(valor);
            break;
        }
        return resultado;
    } 

    public void recibirEleccion(int eleccion){
        this.eleccion = eleccion;
    }

    public void recibirValor(double valor){
        this.valor = valor;
    }

    public String getRespuesta(){
        String respuesta = "";
        respuesta = ""+convertir()+ConversionA();
        return respuesta;
    }

}