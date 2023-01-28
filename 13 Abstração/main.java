import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random rand = new Random();
        String[] marcas = {"Renout", "fiat","Lambo", "Ferrari"};

        List<CarroTerrestre> veiculos = new ArrayList<CarroTerrestre>();

        for (int i = 0; i < 100; i++) {
    
            veiculos.add(new CarroTerrestre(marcas[rand.nextInt(marcas.length)]));

        }
        
        for(CarroTerrestre veiculo : veiculos){
            System.out.println(veiculo.getStatusCarro());
        }
        
    }

}
