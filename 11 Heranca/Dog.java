public class Dog extends Animal {
    public Dog(String nome, int idade, String raca) {
        super(nome, idade,raca);
    }

    @Override
    void acao() {
        System.out.println("Auauauau!!!");
    }

}
