public class Reserva {
    // Atributos da classe
    private Pessoa pessoa;
    private Item item;
    private Localizacao localizacao;

    // Construtor padrão
    public Reserva() {
        // Inicialize os atributos se necessário
        this.pessoa = new Pessoa();
        this.item = new Item();
        this.localizacao = new Localizacao();
    }

    // Construtor personalizado
    public Reserva(Pessoa pessoa, Item item, Localizacao localizacao) {
        this.pessoa = pessoa;
        this.item = item;
        this.localizacao = localizacao;
    }

    // Métodos getters e setters para 'pessoa'
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    // Métodos getters e setters para 'item'
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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
        return "Reserva [pessoa=" + pessoa + ", item=" + item + ", localizacao=" + localizacao + "]";
    }
}