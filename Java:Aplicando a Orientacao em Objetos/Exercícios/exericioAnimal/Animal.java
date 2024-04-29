package exericios.exericioAnimal;
/*Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato,
        que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação
@Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada
        subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.*/
public class Animal {
    protected String nome;
    protected int idade;
    protected String cor;

    public Animal(String nome,int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String emitirSom(){
        System.out.println("* barulho *");
        return "*barulho";
    }
}
