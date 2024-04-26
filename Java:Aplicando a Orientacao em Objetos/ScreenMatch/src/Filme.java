public class Filme {
    String nome;
    int anoDeLancamento=0;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes=0;
    int totalDeAvaliacoes=0;
    int duracaoEmMinutos=0;

void exibirFichaTecnica(){
    System.out.println("Nome do filme: " + nome);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
}
void avalia(double nota){
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
}

double pegaMedia(){
    return somaDasAvaliacoes / totalDeAvaliacoes;
}
} //fecha class

