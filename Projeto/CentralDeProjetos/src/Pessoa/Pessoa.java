package Pessoa;

public class Pessoa {
	
	private  String nome;
	private String email;
	private String cpf;
	
	public Pessoa(String nome,String email,String cpf) throws Exception{
		if (nome.trim().isEmpty() || nome == null){
			throw new Exception("O nome n�o pode ser nulo ou vazio.");
		}
		if (email.trim().isEmpty() || nome == null){
			throw new Exception("O email n�o pode ser nulo ou vazio.");
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

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "<<<Nome>>> ; " + nome + "\n<<<Email>>> ; " + email + "\n<<<CPF>>> ; " + cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
