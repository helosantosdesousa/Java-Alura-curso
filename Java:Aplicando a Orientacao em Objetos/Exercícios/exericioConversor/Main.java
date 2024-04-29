package exericios.exericioConversor;

import java.util.Scanner;

public class Main {
    static Scanner e = new Scanner(System.in);
   static private double valorDolar;

    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.println("Qual o valor em dolar?");
        valorDolar = e.nextDouble();

        System.out.println("Valor em reais: " +conversorMoeda.converterDolarParaReal(valorDolar));

    }
}
