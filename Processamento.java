package av1POB;

import java.util.ArrayList;
import java.util.Scanner;

public class Processamento {
	private static ArrayList<Produto> produtos = new ArrayList<>();
	private static ArrayList<ItensCarrinho> itensCarrinho = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public void menu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Adicionar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
           }
        }
        }

public void adicionarProduto() {
    System.out.print("Digite o ID do produto: ");
    int id = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Digite o nome do produto: ");
    String nome = scanner.nextLine();

    System.out.print("Digite o preço do produto: ");
    double preco = scanner.nextDouble();
    scanner.nextLine(); 
    Produto produto = new Produto(id, preco, nome);
    
    produtos.add(produto);
}

public void listarProdutos() {
    for (Produto produto : produtos) {
        System.out.println("Produto: " + produto.getNome()+" id: " + produto.getId());
       
    }
}
public void adicionarAoCarrinho(){
	System.out.print("Digite o id do produto que deseja adicionar ao carrinho: ");
    int idAdc = scanner.nextInt();
    scanner.nextLine(); 
	for (Produto produto : produtos) {
		if(produto.getId()== idAdc) {
			System.out.print("Digite a quantidade que deseja adicionar: ");
		    int qtd = scanner.nextInt();
		    scanner.nextLine(); 
		    
		}
	}
}

public void listarCarrinho() {
    for (ItensCarrinho ic : itensCarrinho) {
        System.out.println("Produto: " + produto.getNome()+" id: " + produto.getId());
}
    System.out.println("Total:" + );
