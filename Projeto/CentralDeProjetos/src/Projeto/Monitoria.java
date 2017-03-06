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
	
}
