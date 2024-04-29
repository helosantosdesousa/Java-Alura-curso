package exericios.exericio05;

public class ProdutoFisico extends Item implements Calculavel{
    public String nome;

    public ProdutoFisico(double desconto, double taxa, double precoBruto, String nome) {
        super(desconto, taxa, precoBruto);
        this.nome = nome;
    }

    @Override
    public double calcularPrecoFinal() {
        double novoPreco;
        novoPreco = getPreco()-getDesconto()+getTaxa();
        setPreco(novoPreco);
        return novoPreco;    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
