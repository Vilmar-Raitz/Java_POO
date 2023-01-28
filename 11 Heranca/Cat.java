public class Cat extends Animal {
    public Cat (String nome, int idade, String raca){
        super(nome,idade,raca);
    }

    @Override
    void acao() {
        System.out.println("Miauuuu!!!");
        
    }
}
