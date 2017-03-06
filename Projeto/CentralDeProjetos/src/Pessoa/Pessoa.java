package Pessoa;

public class Pessoa {
	
	private  String nome;
	private String email;
	private int cpf;
	
	public Pessoa(String nome,String email,int cpf) throws Exception{
		if (nome.equals(" ".trim()) || nome == null){
			throw new Exception("O nome não pode ser nulo ou vazio.");
		}
		if (email.equals(" ".trim()) || nome == null){
			throw new Exception("O email não pode ser nulo ou vazio.");
		}
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "<<<Nome>>> ; " + nome + "\n<<<Email>>> ; " + email + "\n<<<CPF>>> ; " + cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
