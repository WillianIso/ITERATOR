import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Concessionaria implements Iterable<Carro>{

    private List<Carro> carros = new ArrayList<Carro>();

    public Concessionaria(Carro... carros) {
        this.carros = Arrays.asList(carros);
    }

    @Override
    public Iterator<Carro> iterator() {
        return carros.iterator();
    }

}