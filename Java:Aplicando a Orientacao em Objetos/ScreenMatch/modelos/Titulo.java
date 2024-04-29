package br.com.alura.screenmatch.modelos;

public class Titulo {


        String nome;
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double somaDasAvaliacoes;
        int totalDeAvaliacoes;
        int duracaoEmMinutos;

        public void exibeFichaTecnica() {
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
        }

        public int getTotalDeAvaliacoes() {
            return totalDeAvaliacoes;
        }

        public void avalia(double nota) {
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        }

        public double pegaMedia() {
            return somaDasAvaliacoes / totalDeAvaliacoes;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}

