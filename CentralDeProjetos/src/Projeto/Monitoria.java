package Projeto;

public class Monitoria extends Projeto{
	
	private String anoLetivo;
	private String disciplina;
	private int expectativa;
		
	public Monitoria(String nome, String objetivo, int dataInicio, int duracao, int custoTotal, int codigo,String anoLetivo,String disciplina,int expectativa)
			throws Exception {
		super(nome, objetivo, 	dataInicio, duracao, custoTotal, codigo);
		this.anoLetivo = anoLetivo;
		this.disciplina = disciplina;
		this.expectativa = expectativa;				
	}

	public String getAnoLetivo() {
		return anoLetivo;
	}

	public void setAnoLetivo(String anoLetivo) {
		this.anoLetivo = anoLetivo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getexpectativa(){
		return expectativa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoLetivo == null) ? 0 : anoLetivo.hashCode());
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + expectativa;
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
		Monitoria other = (Monitoria) obj;
		if (anoLetivo == null) {
			if (other.anoLetivo != null)
				return false;
		} else if (!anoLetivo.equals(other.anoLetivo))
			return false;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (expectativa != other.expectativa)
			return false;
		return true;
	}	
}
