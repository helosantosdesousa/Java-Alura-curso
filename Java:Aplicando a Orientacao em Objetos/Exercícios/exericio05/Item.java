package exericios.exericio05;

public class Item {
    public double desconto;
    public double taxa;
    public double preco;

    public Item(double desconto, double taxa, double precoBruto) {
        this.desconto = desconto;
        this.taxa = taxa;
        this.preco = precoBruto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
