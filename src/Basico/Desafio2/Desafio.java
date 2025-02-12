package Basico.Desafio2;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeNinjas;
        int opcao = 0;
        int indiceDoUltimoNinja = 0;

        System.out.println("===== Programa iniciado =====");
        System.out.println("[!] Antes de começarmos precisamos definir um parâmetro [!]");

        System.out.print("Digite o número de máximo de ninjas que pode ser registrado a ser adicionado: ");
        numeroDeNinjas = scanner.nextInt();

        String[] ninjas = new String[numeroDeNinjas];

        while(opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if(indiceDoUltimoNinja < numeroDeNinjas) {
                        System.out.print("\nDigite nome do novo ninja a ser cadastrado: ");
                        ninjas[indiceDoUltimoNinja] = scanner.next();
                        indiceDoUltimoNinja++;
                    } else {
                        System.out.println("\n[!] O registro de ninjas foi suspenso pois atingiu a quantidade máxima [!]");
                    }
                    break;
                case 2:
                    System.out.println("\nLista dos ninjas registrados:");
                    for(int i = 0; i < indiceDoUltimoNinja; i++) {
                        System.out.println(
                            "Número de registro ninja: " +String.format("%03d", i) + " | " + ninjas[i]
                        );
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n[ERRO] Opção inválida; Menu Ninja será reiniciado [ERRO]");
                    break;
            }
        }

        System.out.println("Obrigado por usar o Registrador Ninja, até uma próxima! (●'◡'●)");

        scanner.close();
    }
}
