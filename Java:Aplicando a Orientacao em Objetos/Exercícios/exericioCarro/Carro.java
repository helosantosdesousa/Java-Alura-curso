package exericios.exericioCarro;
/*Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
        Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular
        e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas
        , utilizando-a na classe principal para definir preços e mostrar informações.*/
public class Carro {
    protected String modelo;
    protected double precoMedio[] = new double[3];

    public Carro(String modelo, double[] precoMedio) {
        this.modelo = modelo;
        this.precoMedio = precoMedio;
    }


    public double calcularMaiorPreco() {
        double max = precoMedio[0];
        for (int i = 1; i < precoMedio.length; i++) {
            if (precoMedio[i] > max) {
                max = precoMedio[i];
            }
        }
        return max;
    }

    public double calcularMenorPreco() {
        double min = precoMedio[0];
        for (int i = 1; i < precoMedio.length; i++) {
            if (precoMedio[i] < min) {
                min = precoMedio[i];
            }
        }
        return min;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double[] getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double[] precoMedio) {
        this.precoMedio = precoMedio;
    }
}
