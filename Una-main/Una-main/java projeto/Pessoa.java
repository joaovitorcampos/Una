public class Pessoa {
    // Atributos da classe
    private String nome;
    private String telefone;
    private String email;
    private String registro;

    // Construtor padrão
    public Pessoa() {
        // Inicialize os atributos se necessário
        this.nome = "";
        this.telefone = "";
        this.email = "";
        this.registro = "";
    }

    // Construtor personalizado
    public Pessoa(String nome, String telefone, String email, String registro) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.registro = registro;
    }

    // Métodos getters e setters para 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters para 'telefone'
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Métodos getters e setters para 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos getters e setters para 'registro'
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", registro=" + registro + "]";
    }
}