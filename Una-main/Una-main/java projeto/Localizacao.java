public class Localizacao {
    // Atributos da classe
    private String ambiente;
    private String tipo;
    private Infraestrutura infraestrutura;

    // Construtor padrão
    public Localizacao() {
        // Inicialize os atributos se necessário
        this.ambiente = "";
        this.tipo = "";
        this.infraestrutura = new Infraestrutura();
    }

    // Construtor personalizado
    public Localizacao(String ambiente, String tipo, Infraestrutura infraestrutura) {
        this.ambiente = ambiente;
        this.tipo = tipo;
        this.infraestrutura = infraestrutura;
    }

    // Métodos getters e setters para 'ambiente'
    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    // Métodos getters e setters para 'tipo'
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos getters e setters para 'infraestrutura'
    public Infraestrutura getInfraestrutura() {
        return infraestrutura;
    }

    public void setInfraestrutura(Infraestrutura infraestrutura) {
        this.infraestrutura = infraestrutura;
    }

    @Override
    public String toString() {
        return "Localizacao [ambiente=" + ambiente + ", tipo=" + tipo + ", infraestrutura=" + infraestrutura + "]";
    }
}