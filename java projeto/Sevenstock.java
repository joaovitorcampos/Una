package sevenstock;
import java.util.Scanner;

public class Sevenstock {
    public static void main (String[] args) {
        Scanner scanner = new scanner(System.in);
        int seletor=0;
        System.out.printf("Olá, bem vindo ao SevenStock, selecione a opção:\n");
        System.out.printf("1- Inserir novo item no inventário\n");
        System.out.printf("2- Realizar um empréstimo\n");
        System.out.printf("3- Realizar uma devolução\n");
        System.out.printf("4- Gerar relatório do inventário\n");
        seletor = scanner.NextInt();
        switch (seletor) {
            case 1:
                Registro registro = new Registro();
                registro.solicitarDadosAoUsuario();
            case 2: 
                Emprestimo emprestimo = new Emprestimo();
                emprestimo.solicitarDadosAoUsuario();
            case 3: 
                Devolucao devolucao = new Devolucao();
                devolucao.solicitarDadosAoUsuario();
            case 4: 
                RelatorioInventario relatorio = new RelatorioInventario();
                relatorio.gerarRelatorio();

        }
            

    }
}