package exericios.exericio05;

public class Livro extends Item implements Calculavel{
public String titulo;


    public Livro(double desconto, double taxa, double precoBruto, String titulo) {
        super(desconto, taxa, precoBruto);
        this.titulo = titulo;
    }

    @Override
    public double calcularPrecoFinal() {
        double novoPreco;
        novoPreco = getPreco()-getDesconto()+getTaxa();
        setPreco(novoPreco);
        return novoPreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
