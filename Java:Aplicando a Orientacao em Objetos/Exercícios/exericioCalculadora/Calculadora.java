package exericios.exericioCalculadora;

import java.util.Scanner;

public class Calculadora {
    //Crie uma classe Calculadora com um método que recebe um
    // número como parâmetro e retorna o dobro desse número.
    static double numero;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("insira o número");
        numero = entrada.nextDouble();

       double dobroNumero = dobrarNumero(numero);
        System.out.println("Número dobrado: " + dobroNumero);

    }
    public static double dobrarNumero(double numero){
        double dobroNumero = numero*2;
        return dobroNumero;
    }
}

