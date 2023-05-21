import java.util.Iterator;

public class Censo {

    public static Integer contarCarrosAtivosConcessionaria(Concessionaria concessionaria) {
        int quantidade = 0;
        for (Carro carro : concessionaria) {
            if (carro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalCarrosConcessionaria(Concessionaria concessionaria) {
        int quantidade = 0;
        for (Iterator a = concessionaria.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}