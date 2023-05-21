import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarCarrosDisponiveisConcessionaria() {
        Concessionaria concessionaria = new Concessionaria(
                new Carro("Civic", true),
                new Carro("Jetta", true),
                new Carro("Golzinho", true),
                new Carro("Palio", true)
        );
        assertEquals(4, Censo.contarTotalCarrosConcessionaria(concessionaria));
    }

    @Test
    void deveContarTotalCarrosConcessionaria() {
        Concessionaria concessionaria = new Concessionaria(
                new Carro("Renegade", true),
                new Carro("Compass", true),
                new Carro("BMW A6", false),
                new Carro("Corolla", true)
        );
        assertEquals(4, Censo.contarTotalCarrosConcessionaria(concessionaria));
    }

}