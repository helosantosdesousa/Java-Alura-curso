package exericios.exericioMultiplicacao;
/*Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada()
        para exibir a tabuada de um número. A classe deve receber o número como parâmetro.*/
public class TabuadaMultiplicacao implements Tabuada{
    public int tabuada[] = new int[11];

    @Override
    public void mostrarTabuada(int numero){
        System.out.println("Tabuada do: " + numero);
        for (int i = 0; i < 11; i++) {
            tabuada[i] = numero*i;
            System.out.println(numero + " * " + i + " = " + tabuada[i]);
        }

    }

}
