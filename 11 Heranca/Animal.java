// HERANÇA
// - É um conceito de orientação a objetos que permite que uma classe herde atributos e métodos de outra classe.
// - A classe que herda é chamada de subclasse ou classe filha.
// - A classe que é herdada é chamada de superclasse ou classe pai.
// - A herança é uma forma de reutilização de código.

abstract class Animal {

    private String nome;
    private int idade;
    private String raca ;
    

    public String getAnimal() {
        return String.format("\nNome: %s.\nIdade: %d\nRaca: %s.", this.nome, this.idade, this.raca);

    }

    public Animal(String nome, int idade, String raca ) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;

    }

    abstract void acao();

}
