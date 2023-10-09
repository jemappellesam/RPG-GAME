import java.util.List;

public class Missao {
    String Titulo;
    Double Progresso;
    String Descricao;
    List<Item> Recompensas;
    String Objetivos;
    GerenciarAcoes Gerenciador;

    public void iniciar(Personagem personsagem){
         Gerenciador.iniciarMissao(personsagem);
    }

    public void completar(Personagem personagem){
        Gerenciador.completarMissao(personagem);
    }
    public void atualizar (double progresso){
        Gerenciador.atualizarMissao(progresso);
    }


}
