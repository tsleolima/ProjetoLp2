package Despesas;

public class Capital implements Despesa{
	
	private String categoria;
	private int valor;
	private int equipamentos;
	private int materialPermanente;

	public Capital(String categoria,int valor,int equipamentos, int materialPermanente){
		this.categoria = categoria;
		this.valor = valor;
		this.equipamentos = equipamentos;
		this.materialPermanente = materialPermanente;
	}

	@Override
	public int getValor() {
		return valor;
	}

	public int getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(int equipamentos) {
		this.equipamentos = equipamentos;
	}

	public int getMaterialPermanente() {
		return materialPermanente;
	}

	public void setMaterialPermanente(int materialPermanente) {
		this.materialPermanente = materialPermanente;
	}

	@Override
	public String getCategoria() {
		return categoria;
	}
	
}
