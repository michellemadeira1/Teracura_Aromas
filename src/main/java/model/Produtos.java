package model;

public class Produtos {

	private Long idProduto;
	
	private String nomeProduto;
	
	private String descricao;
	
	private Double preco;
	
	public Produtos () {
		
	}

	public Produtos(Long idProduto, String nomeProduto, String descricao, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
