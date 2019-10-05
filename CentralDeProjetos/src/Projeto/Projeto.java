package Projeto;

import java.util.ArrayList;
import java.util.List;

import Despesas.Despesa;

public class Projeto {
	
	private String nome;
	private String objetivo;
	private int dataInicio;
	private int duracao;
	private int codigo;
	private int custoTotal;
	
	private List<Despesa> despesas;
	
	
	public Projeto(String nome,String objetivo,int dataInicio,int duracao,int custoTotal,int codigo) throws Exception{
		if (nome.equalsIgnoreCase(" ") || nome == null){
			throw new Exception("O nome n�o pode ser nulo ou vazio.");
		}
		if (objetivo.equalsIgnoreCase(" ") || nome == null){
			throw new Exception("O objetivo n�o pode ser nulo ou vazio.");
		}
		if (dataInicio < 0){
			throw new Exception("A data de Inicio n�o pode ser negativa.");
		}
		if (duracao < 0){
			throw new Exception("A dura��o n�o pode ser negativa.");
		}
		if (custoTotal < 0){
			throw new Exception("O custo Total n�o pode ser negativa.");
		}
		this.nome = nome;
		this.objetivo = objetivo;
		this.dataInicio = dataInicio;
		this.duracao = duracao;
		this.custoTotal = custoTotal;
		this.codigo = codigo;
		despesas = new ArrayList<Despesa>();
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getCustoTotal() {
		return custoTotal;
	}


	public void setCustoTotal(int custoTotal) {
		this.custoTotal = custoTotal;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getObjetivo() {
		return objetivo;
	}


	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}


	public int getDuracao() {
		return duracao;
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}


	public int getDataInicio() {
		return dataInicio;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + custoTotal;
		result = prime * result + dataInicio;
		result = prime * result + ((despesas == null) ? 0 : despesas.hashCode());
		result = prime * result + duracao;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((objetivo == null) ? 0 : objetivo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (codigo != other.codigo)
			return false;
		if (custoTotal != other.custoTotal)
			return false;
		if (dataInicio != other.dataInicio)
			return false;
		if (despesas == null) {
			if (other.despesas != null)
				return false;
		} else if (!despesas.equals(other.despesas))
			return false;
		if (duracao != other.duracao)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (objetivo == null) {
			if (other.objetivo != null)
				return false;
		} else if (!objetivo.equals(other.objetivo))
			return false;
		return true;
	}
	
	
}