package Despesas;

public class Custeio implements Despesa{

	private int valor;
	private String categoria;
	private tipoDeCusteio tipodecusteio;
	
	public Custeio(String categoria,int valor){
		this.valor = valor;
		this.categoria = categoria;
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
