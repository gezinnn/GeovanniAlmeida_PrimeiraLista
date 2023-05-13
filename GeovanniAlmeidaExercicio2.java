/* 4 Números ao Quadrado
Nome: Geovanni Almeida
Data: 08/05/2023 */

import java.util.Scanner;

public class GeovanniAlmeidaExercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      // Aqui esta as variaveis

        System.out.println("Digite a Primeiro Número:");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a Segundo Número :");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a Terceiro Número :");
        double n3 = scanner.nextDouble();
        
        System.out.println("Digite a Quarto Número :");
        double n4 = scanner.nextDouble();

       // Aqui esta o processamento

        double quadrado1 = Math.pow(n1,2);
        double quadrado2 = Math.pow(n2,2);
        double quadrado3 = Math.pow(n3,2);
        double quadrado4 = Math.pow(n4,2);

        double soma = quadrado1+quadrado2+quadrado3+quadrado4;

        //Aqui esta a saída
        
        System.out.println("A soma dos quadrados é :"+ soma);

        
    }
    
}