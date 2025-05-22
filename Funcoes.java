package code;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
    public static void exibirMenu() {
        System.out.println("_________________MENU_________________");
        System.out.println("1) Listar Todos os Livros\n2) Adicionar Novo Livro\n3) Pesquisar Livro por Título" +
                "\n4) Excluir Livro\n5) Sair do Sistema");
        System.out.println("_____________________________________");
        System.out.print("Digite sua opção: ");

    }

    public static void listar(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("Não há livros cadastrados em nossa biblioteca no momento");
        }else {
            System.out.println("Lista de Livros:");
            int contador = 1;
            for (String biblioteca : lista) {
                System.out.println(contador + ") " + biblioteca);
                contador++;
            }
        }
    }

    public static void adicionar(ArrayList<String> lista, Scanner scanner) {
        System.out.println("Qual é o título do Livro?");
        String livro = scanner.nextLine().trim();
        System.out.println("Quem é o autor do Livro?");
        String autor = scanner.nextLine().trim();
        if (livro.isEmpty() || autor.isEmpty()) {
            System.out.println("Falha no cadastro. Por favor, verifique o nome do livro e do autor.");
        } else {
            lista.add("Livro " + livro + " do autor " + autor);
            System.out.println("O livro '" + livro + "' do autor '" + autor + "' foi adicionado a biblioteca");
        }
    }

    public static void pesquisar (ArrayList<String> lista, Scanner scanner){
        System.out.println("Qual é o título do Livro?");
        String livroPesquisado = scanner.nextLine().trim();

        int contador = 0;

        if (livroPesquisado.isEmpty()) {
            System.out.println("Você precisa digitar o título do livro para pesquisar.");
        } else {
            for (String biblioteca : lista) {
                if (biblioteca.toLowerCase().contains(livroPesquisado.toLowerCase())) {
                    System.out.println(biblioteca);
                    contador++;
                }
            }

            if (contador == 0) {
                System.out.println("Livro não encontrado.");
            }
        }
    }

    public static void remover (ArrayList<String> lista, Scanner scanner){
        System.out.println("Qual livro você deseja remover?");
        String titulo = scanner.nextLine();
        System.out.println("Quem é o autor?");
        String autor = scanner.nextLine();
        String removerCompleto =("Livro "+titulo+" do autor "+autor);
        if (lista.contains(removerCompleto)){
            lista.remove(removerCompleto);
            System.out.println(removerCompleto+" foi removido com sucesso!");
        }else{
            System.out.println("Livro não encontrado. Verifique se o título e o autor estão corretos.");
        }

    }
}


