/* Algorimto pra distiguir sua faixa etaria
Nome: Geovanni Almeida
Data: 08/05/2023 */



import java.util.Scanner;

public class GeovanniAlmeidaExercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui estao as variaveis 

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        String faixaEtaria;

        //Aqui esta o processamento

        if (idade >= 0 && idade <= 12) {
            faixaEtaria = "Criança";
        } else if (idade >= 13 && idade <= 19) {
            faixaEtaria = "Adolescente";
        } else if (idade >= 20 && idade <= 65) {
            faixaEtaria = "Adulto";
        } else {
            faixaEtaria = "Idoso";
        }

        //Aqui esta a saída

        System.out.println("Sua faixa etária é: " + faixaEtaria);
    }
}
