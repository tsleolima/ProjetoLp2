package Despesas;

public class Capital implements Despesa{
	
	private String categoria;
	private int valor;
	private tipoDeCapital tiposdecapital;

	public Capital(String categoria,int valor){
		this.categoria = categoria;
		this.valor = valor;

	}

	@Override
	public int getValor() {
		return valor;
	}

	@Override
	public String getCategoria() {
		return categoria;
	}
	
}
