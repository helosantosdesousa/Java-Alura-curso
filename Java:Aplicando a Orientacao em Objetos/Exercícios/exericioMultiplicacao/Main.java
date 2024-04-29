package exericios.exericioMultiplicacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();

        System.out.println("Qual número? 0-9");
        int numero = e.nextInt();

        tabuada.mostrarTabuada(numero);

    }
}
