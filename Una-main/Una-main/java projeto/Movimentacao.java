import java.util.Date;

public class Movimentacao {
    // Atributos da classe
    private Item item;
    private String tipo;
    private Date dataHora;
    private Pessoa pessoa;
    private Localizacao localizacao;

    // Construtor padrão
    public Movimentacao() {
        // Inicialize os atributos se necessário
        this.item = new Item();
        this.tipo = "";
        this.dataHora = new Date();
        this.pessoa = new Pessoa();
        this.localizacao = new Localizacao();
    }

    // Construtor personalizado
    public Movimentacao(Item item, String tipo, Date dataHora, Pessoa pessoa, Localizacao localizacao) {
        this.item = item;
        this.tipo = tipo;
        this.dataHora = dataHora;
        this.pessoa = pessoa;
        this.localizacao = localizacao;
    }

    // Métodos getters e setters para 'item'
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    // Métodos getters e setters para 'tipo'
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos getters e setters para 'dataHora'
    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    // Métodos getters e setters para 'pessoa'
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    // Métodos getters e setters para 'localizacao'
    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Movimentacao [item=" + item + ", tipo=" + tipo + ", dataHora=" + dataHora + ", pessoa=" + pessoa
                + ", localizacao=" + localizacao + "]";
    }
}