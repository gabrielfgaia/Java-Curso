//. A prefeitura de uma cidade fez uma pesquisa com 200 pessoas, coletando dados sobre o salário e o número de filhos. 
//  A prefeitura deseja saber: 
//• A média do salário dessas pessoas 
//• A média do número de filhos 
//• O maior salário

import java.util.Scanner;

public class Moradores {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int[] moradores = new int[3];
        String[] nomePessoa = new String[moradores.length];
        int [] numeroFilhos = new int[moradores.length];
        double [] salario = new double[moradores.length];
        double mediaSalario, mediaFilhos, maiorSalario;
        int i;

        for (i=0;i<moradores.length;i++){
        
        System.out.println("\n\n\nDigite o nome da pessoa: ");
        nomePessoa[i] = sc.next();

        System.out.println("\nDigite o numero de filhos: ");
        numeroFilhos[i] = sc.nextInt();

        System.out.println("\nDigite o valor do salário: ");
        salario[i] = sc.nextDouble();

        }

        for (i = 0; i < moradores.length;i++){
            System.out.printf("\nMorador: %s", nomePessoa[i]);

            System.out.printf("\nSalario: %.2f", salario[i]);

            System.out.printf("\nFilhos: %d\n======================\n",numeroFilhos[i]);

        }
        

        //O maior salário

        maiorSalario = Double.MIN_VALUE; 

        for (i = 0; i < salario.length;i++){
            if (salario[i] > maiorSalario){ // salva o valor do primeiro índice e depois verifica se o valor dos próximos serão maiores.
                maiorSalario = salario[i]; // quando ele acha, o valor da posição do índice é salvo como o maior.

            }

        }

        System.out.printf("\nMaior salário: %.2f", maiorSalario);

        //Media salário

        double somaSalario = 0;
        

        for (i = 0; i < salario.length; i++) {
            somaSalario+=salario[i];
        }

        mediaSalario = (somaSalario/salario.length);
        System.out.printf("\nSalario Medio: %.2f", mediaSalario);

        //Media num. filhos

        int somaFilho = 0;

        for (i = 0 ; i < numeroFilhos.length; i++){
            somaFilho+=numeroFilhos[i];
        }
        
        mediaFilhos = (somaFilho/numeroFilhos.length);
        System.out.printf("Media Filhos: %.2f", mediaFilhos);
    }
    
}


