public class Fornecedor {
    // Atributos da classe
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String documento;

    // Construtor padrão
    public Fornecedor() {
        // Inicialize os atributos se necessário
        this.nome = "";
        this.endereco = "";
        this.email = "";
        this.telefone = "";
        this.documento = "";
    }

    // Construtor personalizado
    public Fornecedor(String nome, String endereco, String email, String telefone, String documento) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.documento = documento;
    }

    // Métodos getters e setters para 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters para 'endereco'
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Métodos getters e setters para 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos getters e setters para 'telefone'
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Métodos getters e setters para 'documento'
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Fornecedor [nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", telefone=" + telefone
                + ", documento=" + documento + "]";
    }
}