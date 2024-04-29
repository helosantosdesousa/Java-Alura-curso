package br.com.alura.screenmatch.calculos;


import br.com.alura.screenmatch.modelos.Titulo;

public class Calculadora {
    private int tempoTotal;

/*    public void inclui(Filme filme){
    tempoTotal += filme.getDuracaoEmMinutos();
    }

    public void inclui (Serie serie){
        tempoTotal+= serie.getDuracaoEmMinutos();
    }*/
    public void inclui(Titulo titulo){
        //ele vê se é serie ou filme pra fazer a conta
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
    public int getTempoTotal() {
        return tempoTotal;
    }


}
