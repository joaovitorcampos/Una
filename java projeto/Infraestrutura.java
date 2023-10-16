public class Infraestrutura {
    // Atributos da classe
    private Categoria categoria;
    private String status;

    // Construtor padrão
    public Infraestrutura() {
        // Inicialize os atributos se necessário
        this.categoria = new Categoria();
        this.status = "";
    }

    // Construtor personalizado
    public Infraestrutura(Categoria categoria, String status) {
        this.categoria = categoria;
        this.status = status;
    }

    // Métodos getters e setters para 'categoria'
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Métodos getters e setters para 'status'
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Infraestrutura [categoria=" + categoria + ", status=" + status + "]";
    }
}