//3. A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc.
//Escreva um algoritmo que gere a série de Fibonacci até o vigésimo termo.


public class Fibonacci {


    public static void main(String[] args) {

            int num1 = 1, num2 = 0;

            for(int i = 0; i < 18; i++){
                if (i == 0 ){
                    
                    System.out.println(num2);

                } else if (i == 1){

                    System.out.println(num1);

                } else {

                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    System.out.println(num1);

                }
            
            }
        
    }

}
