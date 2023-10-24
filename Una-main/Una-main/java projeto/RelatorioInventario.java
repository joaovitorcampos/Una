import java.util.List;
import java.util.Scanner;

public class RelatorioInventario {
    // Outros atributos e métodos da classe...

    // Método para gerar um relatório de inventário para um item específico
    public void gerarRelatorio() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o ID do item para o qual deseja gerar o relatório: ");
            int idItem = scanner.nextInt();
            
            Item itemSelecionado = encontrarItemPorId(idItem);
            
            if (itemSelecionado != null) {
                System.out.println("=== Relatório de Inventário ===");
                System.out.println("ID | Categoria | Descrição | Patrimônio | Status | Observações");
                System.out.println(itemSelecionado.getId() + " | " + itemSelecionado.getCategoria().getNome() + " | " +
                        itemSelecionado.getDescricao() + " | " + itemSelecionado.getPatrimonio() + " | " +
                        itemSelecionado.getStatus() + " | " + itemSelecionado.getObservacoes());
            } else {
                System.out.println("Item não encontrado com o ID informado.");
            }
        }
    }

    // Método auxiliar para encontrar um item por ID
    private Item encontrarItemPorId(int id) {
        return null;
        // Retorna null se o item não for encontrado.
    }
}
