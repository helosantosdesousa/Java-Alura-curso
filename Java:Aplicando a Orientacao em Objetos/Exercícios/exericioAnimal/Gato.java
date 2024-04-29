package exericios.exericioAnimal;

public class Gato extends Animal{
    protected String habilidade;

    public Gato(String nome, int idade, String cor, String habilidade) {
        super(nome, idade, cor);
        this.habilidade = habilidade;
    }

    @Override
    public String emitirSom(){
        System.out.println("miau");
        return "** miau**";
    }
    public void arranharMovel(){
        System.out.println("Arranhou móvel");
    }
}
