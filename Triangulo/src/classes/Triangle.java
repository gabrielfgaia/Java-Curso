package classes;

public class Triangle {

    public double l1,l2,l3;

    public double area;

    public double calculateArea () {
        double p = (l1 + l2 + l3)/2;
        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }



}
