package exericios.exericioMusica;
public class Musica {
    static String titulo = "Into the new world";
    static String artista = "Girls Generation";
    static int anoLancamento = 2012;
    static double avaliacao;

    public static void main(String[] args) {
        exibirFichaTecnica(titulo, artista, anoLancamento);
        avaliacao = avaliarMusica();
        double nota = notaGeral(avaliacao);
    }

    static void exibirFichaTecnica(String titulo, String artista, int anoLancamento){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    static double avaliarMusica(){
        double nota1 = 5.0, nota2 = 10.0, nota3 = 6.0;
        double somaNotas = nota1 + nota2 + nota3;
        avaliacao = somaNotas / 3.0;
        return avaliacao;
    }

    static double notaGeral(double avaliacao){
        System.out.println("Avaliação Média: " + avaliacao);
        return avaliacao;
    }
}

