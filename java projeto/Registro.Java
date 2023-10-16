import java.util.Random;
import java.util.Scanner;

public class Registro {
    private static final int MIN_ID = 1;
    private static final int MAX_ID = 99999;

    private Item item;
    private Fornecedor fornecedor;
    private Infraestrutura infraestrutura;

    public Registro() {
        this.item = new Item();
        this.fornecedor = new Fornecedor();
        this.infraestrutura = new Infraestrutura();
    }

    public void solicitarDadosAoUsuario() {
        Scanner scanner = new Scanner(System.in);

        // Gerar um ID aleatório entre 1 e 99999
        int randomId = gerarIdAleatorio();

        this.item.setId(randomId);

        System.out.println("Por favor, forneça os dados para o registro:");

        System.out.print("Descrição do Item: ");
        this.item.setDescricao(scanner.nextLine());

        System.out.print("Patrimônio do Item: ");
        this.item.setPatrimonio(scanner.nextLine());

        System.out.print("Status do Item: ");
        this.item.setStatus(scanner.nextLine());

        System.out.print("Observações do Item: ");
        this.item.setObservacoes(scanner.nextLine());

        System.out.print("Nome do Fornecedor: ");
        this.fornecedor.setNome(scanner.nextLine());

        System.out.print("Endereço do Fornecedor: ");
        this.fornecedor.setEndereco(scanner.nextLine());

        System.out.print("E-mail do Fornecedor: ");
        this.fornecedor.setEmail(scanner.nextLine());

       
        System.out.print("Telefone do Fornecedor: ");
        this.fornecedor.setTelefone(scanner.nextLine());

        System.out.print("Responsável do Fornecedor: ");
        this.fornecedor.setResponsavel(scanner.nextLine());

        System.out.print("Nome da Categoria da Infraestrutura: ");
        this.infraestrutura.getCategoria().setNome(scanner.nextLine());

        System.out.print("Status da Infraestrutura: ");
        this.infraestrutura.setStatus(scanner.nextLine());

        System.out.println("\nRegistro concluído. Aqui estão as informações:");
        System.out.println("Item: " + this.item);
        System.out.println("Fornecedor: " + this.fornecedor);
        System.out.println("Infraestrutura: " + this.infraestrutura);
    }

    private int gerarIdAleatorio() {
        Random random = new Random();
        return random.nextInt((MAX_ID - MIN_ID) + 1) + MIN_ID;
    }

}