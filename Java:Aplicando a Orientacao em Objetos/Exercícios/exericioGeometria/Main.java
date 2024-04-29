package exericios.exericioGeometria;

import java.util.Scanner;

public class Main {
    static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        CalculadoraSalaRetangular forma = new CalculadoraSalaRetangular();

        System.out.println("Inserir altura: ");
        double altura = e.nextDouble();
        System.out.println("Inserir largura: ");
        double largura = e.nextDouble();


        System.out.println("Área: " + forma.calcularArea(altura, largura));
        System.out.println("Perímetro: " + forma.calcularPerimetro(altura,largura));
    }


}
