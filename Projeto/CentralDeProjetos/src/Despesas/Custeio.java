package Despesas;

public class Custeio implements Despesa{

	private int valor;
	private String categoria;
	private int materialExpediente;
	private int servicos;
	private int diarias;
	
	public int getMaterialExpediente() {
		return materialExpediente;
	}

	public void setMaterialExpediente(int materialExpediente) {
		this.materialExpediente = materialExpediente;
	}

	public int getServicos() {
		return servicos;
	}

	public void setServicos(int servicos) {
		this.servicos = servicos;
	}

	public int getDiarias() {
		return diarias;
	}

	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}

	public Custeio(String categoria, int valor,int materialExpediente,int servicos, int diarias){
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
