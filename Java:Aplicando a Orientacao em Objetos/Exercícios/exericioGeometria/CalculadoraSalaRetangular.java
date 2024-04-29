package exericios.exericioGeometria;
/*Crie uma classe CalculadoraSalaRetangular que implementa uma interface exericios.exericioGeometria.CalculoGeometrico
        com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro
        de uma sala retangular. A classe deve receber altura e largura como parâmetros.*/
public class CalculadoraSalaRetangular implements CalculoGeometrico {


    @Override
    public double calcularArea(double altura, double largura) {
        return largura*altura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return 2*(largura+altura);
    }


}
