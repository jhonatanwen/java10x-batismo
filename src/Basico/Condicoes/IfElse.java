package Basico.Condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*
         * IF e Else - Condições
         * Objetivo: Passar o ninja de nível conforme o número de missões
         * */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        // se (condição) {faça isso}
        if (numeroDeMissoes >= 10 && idade > 15) {
            System.out.println("Naruto está pronto para passar de nível");
        } else {
            System.out.println("Naruto não completou o número mínimo de missões");
        }
    }
}
