package exericios.exericioTemperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        Scanner e = new Scanner(System.in);

        System.out.println("***** CONVERSOR ******");
        System.out.println("Deseja converter \n1 - Celcius para faren \n2 - Faren para Celcius");
        int resp = e.nextInt();

        System.out.println("Insira a temperatura a ser convertida");
        double temperatura = e.nextDouble();

        double temperaturaConvertida;

        switch (resp) {
            case 1:
                System.out.println("Temperatura convertida: " + conversor.celciusParaFaren(temperatura) + "ºF");

                break;
            case 2:
                System.out.println("Temperatrua convertida: " + conversor.farenParaCelcius(temperatura) + "ºC");
                break;
        }
    }
}
