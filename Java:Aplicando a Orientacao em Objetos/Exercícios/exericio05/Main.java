package exericios.exericio05;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro(10, 0, 45.00, "Os sete maridos de Evelyn Hugo");
        ProdutoFisico produto = new ProdutoFisico(15, 5, 120.50, "Álbum do Jão");


        livro.calcularPrecoFinal();
        produto.calcularPrecoFinal();
        System.out.println("Preço livro: " + livro.getPreco());
        System.out.println("Preço produto: " + produto.getPreco());

    }
}
