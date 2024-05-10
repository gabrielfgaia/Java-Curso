package entities;


public class Aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double notaMaxima = 95;

    public double notaSoma(){
        
        return nota1 + nota2 + nota3;
    }

    public String situacao(){

        if (notaSoma() <= ( notaMaxima * 0.6 )){

            System.out.printf("Não passou.\nFaltam: %.2f", (notaMaxima * 0.6) - notaSoma() );
            

        } else {

            System.out.println("Passou");

        }

        
        return " ";

    }

    @Override
    public String toString (){

        return nome + ": " + "\nNota: "+ notaSoma() + "\n" + situacao();
    }

}
