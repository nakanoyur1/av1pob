import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Adicionar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Remover produto");
            System.out.println("4. Alterar produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    alterarProduto();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void adicionarProduto() {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Digite o código de barras do produto: ");
        String codigoDeBarras = scanner.nextLine();

        System.out.print("Digite o SKU do produto: ");
        String sku = scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a categoria do produto: ");
        String categoria = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Digite o peso do produto: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Digite o fabricante do produto: ");
        String fabricante = scanner.nextLine();

        Produto produto = new Produto(id, codigoDeBarras, sku, nome, descricao, categoria, preco, peso, fabricante);
        produtos.add(produto);
    }

    public static void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
        }
    }

    public static void removerProduto() {
        System.out.print("Digite o ID do produto a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        produtos.removeIf(produto -> produto.getId() == id);
    }

    public static void alterarProduto() {
        System.out.print("Digite o ID do produto a ser alterado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                System.out.print("Digite o novo nome do produto: ");
                String nome = scanner.nextLine();
                produto.setNome(nome);
                // Repita para os outros campos que você deseja alterar...
                break;
            }
        }
    }
}
