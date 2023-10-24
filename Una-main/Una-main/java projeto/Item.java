public class Item {
    // Atributos da classe
    private Categoria categoria;
    private String descricao;
    private String patrimonio;
    private int id;
    private String status;
    private String observacoes;

    // Construtor padrão
    public Item() {
        // Inicialize os atributos se necessário
        this.categoria = new Categoria();
        this.descricao = "";
        this.patrimonio = "";
        this.id = 0;
        this.status = "";
        this.observacoes = "";
    }

    // Construtor personalizado
    public Item(Categoria categoria, String descricao, String patrimonio, int id, String status, String observacoes) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.patrimonio = patrimonio;
        this.id = id;
        this.status = status;
        this.observacoes = observacoes;
    }

    // Métodos getters e setters para 'categoria'
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Métodos getters e setters para 'descricao'
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    // Métodos getters e setters para 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // Métodos getters e setters para 'patrimonio'
    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    // Métodos getters e setters para 'status'
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Métodos getters e setters para 'observacoes'
    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Item [categoria=" + categoria + ", \ndescricao=" + descricao + ", \npatrimonio=" + patrimonio + ", \nid=" + id
                + ", \nstatus=" + status + ", \nobservacoes=" + observacoes + "]";
    }

    
}