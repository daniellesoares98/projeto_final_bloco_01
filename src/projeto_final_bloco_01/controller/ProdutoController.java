package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> produtos = new ArrayList<>();
	private int id = 0;
	
	public int gerarId() {
		return ++id;
	}

	@Override
	public void cadastrar(Produto produto) {
		produtos.add(produto);
		
	}

	@Override
	public List<Produto> listarTodos() {
		return produtos;
	}

	@Override
	public Produto buscarPorId(int id) {
		
		for(Produto produto : produtos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Produto produtoAtualizado) {
		
		for (int contador = 0; contador < produtos.size(); contador++) {
			if (produtos.get(contador).getId() == produtoAtualizado.getId()) {
				produtos.set(contador, produtoAtualizado);
			}
		}
	}

	@Override
	public void deletar(int id) {
		
		for(Produto produto : produtos) {
			if (produto.getId() == id) {
				produtos.remove(produto);
				break;
			}
		}
		
	}

	
	
}
