package code;
import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> biblioteca = new ArrayList<String>();
        int opcao = 0;
        while (opcao !=5) {
            Funcoes.exibirMenu();
            String entrada = scanner.nextLine();

            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException erro) {
                System.out.println("Entrada inválida! Digite um número entre 1 e 5.");
                continue;
            }

            switch (opcao) {
                case 1:
                    Funcoes.listar(biblioteca);
                    break;
                case 2:
                    Funcoes.adicionar(biblioteca, scanner);
                    break;
                case 3:
                    Funcoes.pesquisar(biblioteca,scanner);
                    break;
                case 4:
                    Funcoes.remover(biblioteca, scanner);
                    break;
                case 5:
                    System.out.println("Saindo do Sistema ");
                    break;
                default:
                    System.out.println("Valor inválido Digite um número entre 1 e 5.");

            }

        }
        scanner.close();

    }

}









