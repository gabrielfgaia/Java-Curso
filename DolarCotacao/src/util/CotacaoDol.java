package util;

public class CotacaoDol {

    public static double IOF = 0.06;
    

    public static  double realDolar (double valDolar, double quantDolar){

        return (valDolar * quantDolar) + IOF * 1.0;

    }
    
}
