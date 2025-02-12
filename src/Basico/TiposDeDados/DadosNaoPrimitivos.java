package Basico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando psvm vai ser compilado pelo java

        /*
         * Dados nao primitivos: String, Array, Class, enum
         * Objetivo: Criar um ninja, e atribuir métodos a ele.
         * */

        // Declarando a variável como NARUTO UZUMAKI
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // ToUppercase vai colocar tudo em CAPSLOCK/maiúsculo
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // ToLowerCase vai colocar tudo em caixa baixa/minúsculo
        System.out.println(aldeiaEmCaixaBaixa);

    }
}