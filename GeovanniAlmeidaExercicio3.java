/* Algoritmo para calcular a cotação do dolar
Nome: Geovanni Almeida
Data: 08/05/2023 */

import java.util.Scanner; 
    public class GeovanniAlmeidaExercicio3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        // Aqui esta as variaveis

        System.out.println("Digite o Valor em R$");
        double valorReais = scanner.nextDouble();
        
        System.out.println("Digite a Cotação Atual:");
        double cotacaoDolar = scanner.nextDouble();

        // Aqui esta o processamento

        double valorDolar = valorReais*cotacaoDolar;
        
        //Aqui esta a saída

        System.out.println("O Valor em dolar é:"+valorDolar);


        }
        
    } 

    