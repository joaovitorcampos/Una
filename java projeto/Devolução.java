import java.util.Scanner;

public class Devolucao {
    private Item item;
    private Localizacao localizacao;

    public Devolucao() {
        this.item = new Item();
        this.localizacao = new Localizacao();
    }

    // Método para solicitar os dados de devolução ao usuário
    public void solicitarDadosAoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, forneça os dados para a devolução:");

        // Solicitar dados do Item
        System.out.println("Dados do Item:");
        this.item.solicitarDadosAoUsuario();

        // Solicitar dados da Localização
        System.out.println("Dados da Localização:");
        this.localizacao.solicitarDadosAoUsuario();
    }

    // Outros métodos da classe Devolucao...

    public static void main(String[] args) {
        Devolucao devolucao = new Devolucao();
        devolucao.solicitarDadosAoUsuario();

    }
}
