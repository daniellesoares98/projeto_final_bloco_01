package projeto_final_bloco_01.repository;

import java.util.List;
import projeto_final_bloco_01.model.Produto;

public interface ProdutoRepository {
	
	public void cadastrar(Produto produto);
	
	public List<Produto> listarTodos();
	
	public Produto buscarPorId(int id);
	
	public void atualizar (Produto produto);
	
	public void deletar(int id);

}
