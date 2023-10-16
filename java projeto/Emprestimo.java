import java.util.Scanner;

public class Emprestimo {
    private Item item;
    private Pessoa pessoa;
    private Localizacao localizacao;
    private String tipo;
    private String dataHora;

    public Emprestimo() {
        this.item = new Item();
        this.pessoa = new Pessoa();
        this.localizacao = new Localizacao();
    }

    // Método para solicitar os dados do empréstimo ao usuário
    public void solicitarDadosAoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, forneça os dados para o empréstimo:");

        System.out.print("Tipo do Empréstimo: ");
        this.tipo = scanner.nextLine();

        System.out.print("Data/Hora do Empréstimo: ");
        this.dataHora = scanner.nextLine();

        // Solicitar dados do Item
        System.out.println("Dados do Item:");
        this.item.solicitarDadosAoUsuario();

        // Solicitar dados da Pessoa
        System.out.println("Dados da Pessoa:");
        this.pessoa.solicitarDadosAoUsuario();

        // Solicitar dados da Localização
        System.out.println("Dados da Localização:");
        this.localizacao.solicitarDadosAoUsuario();
    }

    // Outros métodos da classe Emprestimo...

    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.solicitarDadosAoUsuario();

    }
}
