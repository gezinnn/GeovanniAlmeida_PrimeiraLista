/* Algoritmo que calcule o perímetro de um círculo,
Nome: Geovanni Almeida
Data: 08/05/2023 */

import java.util.Scanner;

public class GeovanniAlmeidaExercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui estao as variaveis

        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        //Aqui esta o processamento

        double perimetro = 2 * Math.PI * raio;

        //Aqui esta a saída

        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}
