public class CalculadoraDeConversiones {
    private Interfaz interfaz;
    private Convertidor convertidor;

    public CalculadoraDeConversiones(){
        interfaz = new Interfaz();
        convertidor = new Convertidor();
    }

    public void verMenu(){
        interfaz.mostrarMenu("Digite el numero de la opcion que desea realizar\n1. Cucharadas a tazas\n2. Tazas a cucharadas\n3. Onzas a gramos\n4. Gramos a onzas\n5. Grados celsius a farenheit\n6. Grados farenheit a celsius.\n7. SALIR");
    }

    public int pedirEleccion(){ 
        int eleccion;
        eleccion = interfaz.solicitarEleccion("\nSU ELECCION: ");
        while (eleccion <= 0 || eleccion >= 8) {
            eleccion = interfaz.solicitarEleccion("\nERROR!! Elija otra vez. \nSU ELECCION: ");
        }
        convertidor.recibirEleccion(eleccion);
        return eleccion;
    }

    public void pedirValor(){
        double valor;
        valor = interfaz.pedirValor("Digite la cantidad de" + interfaz.ConversionDe() + " a convertir: ");
        convertidor.recibirValor(valor);
    }

    public void verResultado(){
        System.out.println("\n----------------------------------------------------------");
        interfaz.MostrarResultado("EL RESULTADO ES : "+convertidor.getRespuesta());
        System.out.println("----------------------------------------------------------\n");
    }

    public void start(){
        verMenu();
        while (pedirEleccion() != 7){
            pedirValor();
            verResultado();
            verMenu();
        }
        System.out.println("\nGracias por usar este programa. \nTenga un bonito dia. :D");
       
    }

}