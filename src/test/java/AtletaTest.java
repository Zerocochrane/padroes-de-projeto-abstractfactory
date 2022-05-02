import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    @Test
    void deveEmitirFutebol() {
        AbstractFactory factory = new FabricaFutebol();
        Atleta atleta = new Atleta(factory);
        assertEquals("A pontuação atual é de 39", atleta.exibirPontuacao());
        assertEquals("Trofeu de Futebol Emitido", atleta.emitirTrofeu());
    }

    @Test
    void deveEmitirXadrez() {
        AbstractFactory factory = new FabricaXadrez();
        Atleta atleta = new Atleta(factory);
        assertEquals("A pontuação atual é de 39", atleta.exibirPontuacao());
        assertEquals("Trofeu de Xadrez Emitido", atleta.emitirTrofeu());
    }

}