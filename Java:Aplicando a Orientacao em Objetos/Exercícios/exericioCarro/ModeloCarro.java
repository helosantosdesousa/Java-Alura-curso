package exericios.exericioCarro;


public class ModeloCarro extends Carro {
    protected String cor;
    protected int anoCarro;

    public ModeloCarro(String modelo, double[] precoMedio, String cor, int anoCarro) {
        super(modelo, precoMedio);
        this.cor = cor;
        this.anoCarro = anoCarro;
    }
}
