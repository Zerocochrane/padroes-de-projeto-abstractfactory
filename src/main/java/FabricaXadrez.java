public class FabricaXadrez implements  AbstractFactory{
    @Override
    public Pontuacao createPontuacao() {
        return new PontuacaoXadrez();
    }

    @Override
    public Trofeu createTrofeu() {
        return new TrofeuXadrez();
    }
}
