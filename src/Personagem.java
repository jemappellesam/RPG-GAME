import java.util.List;

public class Personagem extends Entidade{

    private List<Item> Itens;
    private GerenciarAcoes Gerenciador;
    public void atacar(Inimigo Inimigo) {
       Gerenciador.atacar(Inimigo);
    }
    public void pegarItem(Item item){
        Gerenciador.pegarItem(item);
    }
    public void usarItem(Item item){
        Gerenciador.usarItem(item);
    }
    public void caminhar(double x, double y){
        Gerenciador.caminhar(x,y);
    }
    public void usarHabilidade(Habilidade habilidade){
         Gerenciador.usarHabilidade(habilidade);
    }
    public Personagem(List<Item> Itens,String nome, int nivel, int saude, int energia, List<Habilidade> habilidades){
        super(nome, nivel, saude,energia,habilidades);
        this.Itens =  Itens;
    }

}
