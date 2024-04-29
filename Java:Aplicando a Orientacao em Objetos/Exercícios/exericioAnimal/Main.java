package exericios.exericioAnimal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Zakk", 11, "Dourado", "Yorkie");
        Gato gato = new Gato("Maria", 5, "Preto", "Audição");

        cachorro.emitirSom();
        gato.emitirSom();

        cachorro.abanarRabo();
        gato.arranharMovel();
    }
}
