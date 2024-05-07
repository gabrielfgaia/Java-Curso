package  entities;

public class Retangulo {

    public double largura;
    public double altura;

    //Calculo da area do retangulo
    public double area(){
        return largura * altura;
    }

    //Calculo do perimetro do retangulo
    public double perimetro(){

        return (2*(largura + altura));
    }


    //A fórmula para calcular a diagonal de um retângulo é d = √(l² + w²), onde l é o comprimento e w é a largura. 
    //
    public double diagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }          
    //A função math.sqrt calcula a raiz quadrada da operação entre parenteses
    //A função math.pow calcula a potencia de uma variavel com o valor da potencia. Ex.: Math.pow(largura, 2)
    
    //Metodo construtor toString(). 
    //Pode imprimir os valores dos atributos ou metodos em formato de String utilizando o nome da classe
    
    public String toString () {
        return "\nArea: "
        + area()
        + "\nPerimetro: "
        + perimetro()
        + "\nDiagonal: "
        + diagonal();
    }

}