import java.util.Scanner;
public class Interfaz {
    private int eleccion;
    private double valor;
    private Scanner entrada;     

    public Interfaz(){
        entrada = new Scanner(System.in);
        eleccion = 0;
    }

    public void mostrarMenu(String menu){
        System.out.println(menu);
    }

    public int solicitarEleccion(String mensaje){
        System.out.println(mensaje);
        int numero = -1;
        String numeroEnLetras;
        numeroEnLetras = entrada.next();
        try {
          numero = Integer.parseInt(numeroEnLetras);
        } catch (Exception e) {
          numero = -1;
        }
        this.eleccion = numero;
        return numero;
    }

    public String ConversionDe(){
        String convierte = "";
        switch(eleccion){
            case 1:
                convierte = " CUCHARADAS";
            break;
            case 2:
                convierte = " TAZAS";
            break;
            case 3:
                convierte = " ONZAS";
            break;
            case 4:
                convierte = " GRAMOS";
            break;
            case 5:
                convierte = " GRADOS CELSIUS";
            break;
            case 6:
                convierte = " GRADOS FARENHEIT";
            break;
        }
        return convierte;
    }

    public double pedirValor(String mensaje){
        System.out.println(mensaje);
        String valorEnLetras;
        boolean intentar = true;
        while (intentar){
            valorEnLetras = entrada.next();
            try {
            valor = Double.parseDouble(valorEnLetras);
            intentar = false;
            } catch (Exception e) {
            System.out.println("ERROR!! " + mensaje);
            intentar = true;
            }
        }
        return valor;
    }

    public void MostrarResultado(String mensaje){
        System.out.println(mensaje);
    }
}