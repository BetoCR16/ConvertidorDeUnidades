public class Masa {
    private double onzas;
    private double gramos;

    public double DeOnzasAGramos(double onzas){
        gramos = onzas*28.3495;

        return gramos;
    }

    public double DeGramosAOnzas(double gramos){
        onzas = gramos*(1/28.3495);

        return onzas;
    }
}
