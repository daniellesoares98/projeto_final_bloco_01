package projeto_final_bloco_01.model;

public class Racao extends Produto {
	
	private String tipoAnimal;
	private String sabor;

	public Racao(int id, String nome, float preco, String categoria, String tipoAnimal, String sabor) {
		super(id, nome, preco, categoria);
		
		this.tipoAnimal = tipoAnimal;
		this.sabor = sabor;
		
		
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
