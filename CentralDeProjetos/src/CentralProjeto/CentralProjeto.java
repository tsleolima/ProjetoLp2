package CentralProjeto;

import java.util.ArrayList;

import Pessoa.Pessoa;

public class CentralProjeto {

	private ArrayList<Pessoa> pessoas;

	public String cadastraPessoa(String cpf, String nome, String email)throws Exception{
		Pessoa p = buscaPessoa(cpf);
		if (p != null){
			throw new Exception("Erro no cadastro de pessoa: Pessoa com mesmo CPF ja cadastrada");
		}
		Pessoa pessoa = new Pessoa(nome, email, cpf);
		pessoas.add(pessoa);
		return cpf;
	}
	
	public void imprime(String cpf){
		System.out.println(cpf);
	}

	public String getInfoPessoa(String cpf, String atributo) throws Exception {
		Pessoa pessoa = buscaPessoa(cpf);
		if (pessoa == null){
			throw new Exception("Erro na consulta de pessoa: Pessoa nao encontrada");
		}

		if (atributo.equalsIgnoreCase("Nome")) {
			String nome = pessoa.getNome();
			return nome; 
		}

		else if (atributo.equalsIgnoreCase("Email")) {
			return pessoa.getEmail(); 
		} else {
			throw new Exception("Erro na atualizacao de pessoa: Atributo inexistente");
		} 
	}
	
	private Pessoa buscaPessoa(String cpf){
		for (Pessoa i:pessoas){
			if (i.getCpf().equals(cpf)){
				return i;}
		} return null;
	}

	public boolean removePessoa(String cpf) throws Exception {
			Pessoa pessoa = buscaPessoa(cpf);
			if (pessoa == null){
				throw new Exception("Erro na consulta de pessoa: Pessoa nao encontrada");
			}
			pessoas.remove(pessoa);
			return true;
	}

	public void listarPessoas() {
		for (int i = 0; i < pessoas.size(); i++) {
//			System.out.println(pessoas.get(i).getNome());
//			System.out.println(pessoas.get(i).getEmail());
//			System.out.println(pessoas.get(i).getCpf());
			System.out.println(pessoas.get(i));
		}
	}

	public void atualizaPessoa(String cpf, String atributo, String valor) throws Exception {
		Pessoa pessoa = buscaPessoa(cpf);
		if (pessoa == null) {
			throw new Exception("Erro na consulta de pessoa: Pessoa nao encontrada");
		}
		if (atributo.equalsIgnoreCase("Nome")) {
			pessoa.setNome(valor);
		}

		else if (atributo.equalsIgnoreCase("Email")) {
			pessoa.setEmail(valor);
		} else if (atributo.equalsIgnoreCase("CPF")) {
			throw new Exception("Erro na atualizacao de pessoa: CPF nao pode ser modificado");
		} else {
			throw new Exception("Erro na atualizacao de pessoa: Atributo inexistente");
		}
	
	}
	
	public CentralProjeto(){
		pessoas = new ArrayList<Pessoa>();
	}
}