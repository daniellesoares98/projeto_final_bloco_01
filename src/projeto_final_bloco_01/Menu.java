package projeto_final_bloco_01;

import java.util.Scanner;
import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.model.Racao;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);
	private static final ProdutoController controller = new ProdutoController();
	
	public static void main(String[] args) {
	
			
		int opcao;
		
		while (true) {
		
		System.out.println("**********************************************");
		System.out.println("                                              ");
		System.out.println("               PET SHOP ONLINE                ");
		System.out.println("                                              ");
		System.out.println("**********************************************");
		System.out.println("                                              ");
		System.out.println("        1 - Listar todos os Produtos          ");
		System.out.println("        2 - Listar Produto pelo ID            ");
		System.out.println("        3 - Cadastrar Produto                 ");
		System.out.println("        4 - Atualizar Produto                 ");
		System.out.println("        5 - Deletar Produto                   ");
		System.out.println("        0 - Sair                              ");
		System.out.println("                                              ");
		System.out.println("**********************************************");
		System.out.println("Entre com a opção desejada:                   ");
		System.out.println("                                              ");
		
		opcao = leia.nextInt();
		leia.nextLine();
		
		if (opcao == 0) {
			break;
		}
		
		switch (opcao) {
		case 1:
			System.out.println("Listar todos os Produtos\n\n");
			
			for (Produto p : controller.listarTodos()) {
				System.out.println("ID: " + p.getId());
				System.out.println("Nome: " + p.getNome());
				System.out.println("Preço: " + p.getPreco());
				System.out.println("Categoria: " + p.getCategoria());
				System.out.println("--------------------------");
			}
			keyPress();
			break;
		case 2: 
			System.out.println("Listar Produtos pelo ID");
			System.out.print("Digite o ID: ");
			int id = leia.nextInt();
			leia.nextLine();
			
			Produto produto = controller.buscarPorId(id);
			
			if(produto != null) {
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Preço: " + produto.getPreco());
			} else {
				System.out.println("Produto não encdontrado!");
			}
			
			keyPress();
			break;
		case 3:
			System.out.println("Cadastrar Produto");
			
			System.out.print("Nome da ração: ");
			String nome = leia.nextLine();
			
			System.out.println("Preço: ");
			float preco = leia.nextFloat();
			leia.nextLine();
			
			System.out.println("Tipo de animal (Cachorro/ Gato): ");
			String tipoAnimal = leia.nextLine();
			
			System.out.println("Sabor: ");
			String sabor = leia.nextLine();	
			
			Racao racao = new Racao(
					controller.gerarId(),
					nome,
					preco,
					"Ração",
					tipoAnimal,
					sabor
					);
			
			controller.cadastrar(racao);
			System.out.println("Ração cadastrada com sucesso!");
			
			keyPress();
			break;
		case 4:
			System.out.println("Atualizar Produto");
			System.out.print("ID do produto: ");
			int idUp = leia.nextInt();
			leia.nextLine();
			
			System.out.println("Novo nome: ");
			String nomeUp = leia.nextLine();
			
			System.out.println("Novo preço: ");
			float precoUp = leia.nextFloat();
			leia.nextLine();
			
			Produto atualizado = new Racao(
					idUp,
					nomeUp,
					precoUp,
					"Ração",
					"Cachorro",
					"Frango"
					);
			
			controller.atualizar(atualizado);
			
			System.out.println("Produto Atualizado!");
			keyPress();
			break;
		case 5:
			System.out.println("Apagar Produto");
			System.out.print("Digite o ID para deletar: ");
			int idDel = leia.nextInt();
			leia.nextLine();
			
			controller.deletar(idDel);
			
			System.out.println("Produto removido!");
			keyPress();
			break;
		default:
			System.out.println("\nOpção Inválida\n");
			keyPress();
			break;
		}
		}
	}
	private static void keyPress() {
		System.out.println("\n\nPressione Enter para continuar...");
		leia.nextLine();
		
	}
	public static void sobre() {
		System.out.println("\n********************************************");
		System.out.println("Projeto Desenvolvido por: Danielle Souza      ");
		System.out.println("Email: contato.daniellesoares@gmail.com       ");
		System.out.println("https://github.com/daniellesoares98           ");
		System.out.println("**********************************************");
	}
	}


