import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
        formas.add(new Losangulo());
        formas.add(new Quadrado());
        formas.add(new Circulo());
        formas.add(new Retangulo());

        for (FormaGeometrica percorrerFormas : formas) {
            percorrerFormas.desenhar();
        }

    }

}
