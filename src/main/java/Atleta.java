public class Atleta {

    private Pontuacao pontuacao;
    private Trofeu trofeu;

    public Atleta(AbstractFactory factory){
        this.pontuacao = factory.createPontuacao();
        this.trofeu = factory.createTrofeu();
    }

    public String exibirPontuacao(){
        return this.pontuacao.exibirPontuacao();
    }

    public String emitirTrofeu(){
        return this.trofeu.emitirTrofeu();
    }
}
