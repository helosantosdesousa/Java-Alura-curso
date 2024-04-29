package exericios.exericioCarro;

public class Main {
    public static void main(String[] args) {
        double[] precoMedio = {25000.00, 27000.00, 29000.00};
        ModeloCarro carro = new ModeloCarro("Tesla X", precoMedio, "Rosa", 2022);

        print(carro);
    }

    public static void print(ModeloCarro carro){
        System.out.println("Carro: " + carro.getModelo());
        System.out.println("Maior preço: " + carro.calcularMaiorPreco());
        System.out.println("Menor preço: " + carro.calcularMenorPreco());
    }


}
