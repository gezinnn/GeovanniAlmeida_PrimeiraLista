/* Média de 4 notas
Nome: Geovanni Almeida
Data: 08/05/2023 */

import java.util.Scanner;

public class GeovanniAlmeidaExercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta as variaveis

        System.out.println("Digite a Primeira Nota :");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a Segunda Nota :");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a Terceira Nota :");
        double n3 = scanner.nextDouble();
        
        System.out.println("Digite a Quarta Nota :");
        double n4 = scanner.nextDouble();

        // Aqui esta o processamento

        double media  = (n1+n2+n3+n4)/4;

        // Aqui esta a saída

        System.out.println("A média das notas é essa:"+ media);

        
    }
    
}