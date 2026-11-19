
import java.util.TreeSet;

public class Jogador extends Classes {

    private String nome;
    private TreeSet<Classes> personagens;

    public Jogador(String nome) {
        this.nome = nome;
        this.personagens = new TreeSet<>();

        cadastrarPersonagens();
    }

    // cria 10 objetos para usar
    private void cadastrarPersonagens() {

        personagens.add(new Classes("Arthas", Classes.TipoClasse.GUERREIRO));
        personagens.add(new Classes("Merlin", Classes.TipoClasse.MAGO));
        personagens.add(new Classes("Legolas", Classes.TipoClasse.ARQUEIRO));
        personagens.add(new Classes("Ezio", Classes.TipoClasse.ASSASSINO));
        personagens.add(new Classes("Uther", Classes.TipoClasse.PALADINO));

        personagens.add(new Classes("Gandalf", Classes.TipoClasse.MAGO));
        personagens.add(new Classes("Conan", Classes.TipoClasse.GUERREIRO));
        personagens.add(new Classes("Robin", Classes.TipoClasse.ARQUEIRO));
        personagens.add(new Classes("Altair", Classes.TipoClasse.ASSASSINO));
        personagens.add(new Classes("Tyrion", Classes.TipoClasse.PALADINO));
    }

    public void adicionarPersonagem(Classes personagem) {
        personagens.add(personagem);
    }

    public void removerPersonagem(Classes personagem) {
        personagens.remove(personagem);
    }

    public TreeSet<Classes> getPersonagens() {
        return personagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
