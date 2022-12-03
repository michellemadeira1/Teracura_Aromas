package model;

public class Categoria {

	private Long id;
	
	private String nomeCategoria;
	
	private String descricao;
	
	
	public Categoria () {
		
	}


	public Categoria(Long id, String nomeCategoria, String descricao) {
		super();
		this.id = id;
		this.nomeCategoria = nomeCategoria;
		this.descricao = descricao;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeCategoria() {
		return nomeCategoria;
	}


	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
