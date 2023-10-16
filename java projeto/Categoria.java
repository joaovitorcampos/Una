public class Categoria {
    // Atributos da classe
    private String nome;
    private String descricao;

    // Construtor padrão
    public Categoria() {
        // Inicialize os atributos se necessário
        this.nome = "";
        this.descricao = "";
    }

    // Construtor personalizado
    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos getters e setters para 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters para descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria [nome=" + nome + ", descricao=" + descricao + "]";
    }
}