package Basico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
         * Laços de Repetição: Vão repetir infinitamente ou até onde você pedir
         */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 10;

        while(numeroDeClones <= numeroMaximoDeClones) {
            System.out.println("Naruto fez " + numeroDeClones + (numeroDeClones == 1 ? " clone" : " clones"));
            numeroDeClones++;
        }

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("Naruto fez " + i + (i == 1 ? " clone" : " clones"));
        }
    }
}
