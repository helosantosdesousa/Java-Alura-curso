package exericios.exericioAnimal;

public class Cachorro extends Animal{
    protected String raca;

    public Cachorro(String nome, int idade, String cor, String raca) {
        super(nome, idade, cor);
        this.raca = raca;
    }

    @Override
    public String emitirSom(){
        System.out.println("au au");
        return "*au au*";
    }
    public void abanarRabo(){
        System.out.println("Abanou o rabo");
    }
}
