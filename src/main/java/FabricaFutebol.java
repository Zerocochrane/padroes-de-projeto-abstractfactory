public class FabricaFutebol implements  AbstractFactory{
    @Override
    public Pontuacao createPontuacao() {
        return new PontuacaoFutebol();
    }

    @Override
    public Trofeu createTrofeu() {
        return new TrofeuFutebol();
    }
}
