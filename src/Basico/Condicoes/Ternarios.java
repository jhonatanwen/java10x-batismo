package Basico.Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        /*
         * Ternários: são maneiras de reduzir o código
         * variável = (condição) ? valorSeVerdadeiro : valorSeFalso;
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");

        int idade = scanner.nextInt();

        // Usando operador ternário para verificar a maioridade
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
