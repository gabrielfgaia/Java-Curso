package util;

public class Celula {
    
    private static final double carga = 25;
    private static double cargaBateria = carga;

    public static void setCargaBateria(double cargaBateria) {
        Celula.cargaBateria = cargaBateria;
    }

    public void consumir() {
        cargaBateria -= 5;
        System.out.println("Carga bateria: " + cargaBateria);
    }

    public void carregar() {
        cargaBateria += 5;
        System.out.println("5 unidades carregadas na célula. Carga bateria: " + cargaBateria );
    }

    public static double getCargaBateria() {
        return cargaBateria;
    }

}
