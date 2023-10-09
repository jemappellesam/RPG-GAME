import java.util.List;

public abstract class Entidade {
    private String Nome;
    private int Nivel;
    private int Saude;
    private int Energia;
    private List<Habilidade> Habilidades;

    public Entidade(String nome, int nivel, int saude, int energia, List<Habilidade> habilidades) {
        Nome = nome;
        Nivel = nivel;
        Saude = saude;
        Energia = energia;
        Habilidades = habilidades;
    }

}
