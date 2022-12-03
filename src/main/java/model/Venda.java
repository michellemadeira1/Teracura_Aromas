package model;

public class Venda {

	private Long idVenda;
	
	private String metodoPagamento;
	
	private String usuario;
	
	private String produtos;
	
	
	public Venda() {
		
	}


	public Venda(Long idVenda, String metodoPagamento, String usuario, String produtos) {
		super();
		this.idVenda = idVenda;
		this.metodoPagamento = metodoPagamento;
		this.usuario = usuario;
		this.produtos = produtos;
	}


	public Long getIdVenda() {
		return idVenda;
	}


	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}


	public String getMetodoPagamento() {
		return metodoPagamento;
	}


	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getProdutos() {
		return produtos;
	}


	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	
	
}
