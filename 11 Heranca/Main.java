import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<Animal>();
        animais.add(new Dog("Pichula Caramelo", 10, "Pirata"));
        animais.add(new Cat("Miau Caramelo", 10, "Almofadinha"));

        // For de Arrays.
        for (Animal animal : animais) { // - Precisa se criar uma variavel para percorrer o aarr

            System.out.println(animal.getAnimal());
            animal.acao();
        }

    }
}
