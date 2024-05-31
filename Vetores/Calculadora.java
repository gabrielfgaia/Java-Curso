//Faça um programa em C/Java que mostre a tabuada de qualquer número escolhido pelo usuário (considerar tabuada do número 1 ao 10). 

import java.util.Scanner;

public class Calculadora {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int[] tabuada = {1,2,3,4,5,6,7,8,9,10};
        int numero, i;

        System.out.println("Numero para calcular a tabuada: ");
        numero = sc.nextInt();

        for (i=0;i<=9;i++){

            System.out.printf("\n%d x %d = %d", (numero), (tabuada[i]), (numero*tabuada[i]));

        }

        sc.close();

    }
    
}
