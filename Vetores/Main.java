//4. Faça um programa em C (com a estrutura do...while) que leia 20 valores inteiros e: 
//– Encontre e mostre o maior valor; 
//– Encontre e mostre o menor valor; 
//– Calcule e mostre a média dos números lidos;

import java.util.Scanner;

public class Main {
    
    public static void main(String []args){

        Scanner sc = new Scanner (System.in);

        
        int n,count = 0;
        double maior = Integer.MIN_VALUE; // Initialize 'maior' with the smallest possible value
        double menor = Integer.MAX_VALUE; // Initialize 'menor' with the largest possible value
        double media;
        
        do {
           
            System.out.println("Insira um numero: ");
            n = sc.nextInt();
            
            if (n > maior) { //n precisa ser comparado sempre com o outro valor
                maior = n; 
            }
            
            if (n < menor) {
                menor = n; 
            }
            
            count++;

        } while (count < 5); 

        media = (maior + menor)/2;
        System.out.println("Media: "+ media);

        sc.close();
    }
}
