package CentralProjeto;

import java.util.ArrayList;
import java.util.List;

import Pessoa.Pessoa;

public class CentralProjeto {

	List<Pessoa> pessoas = new ArrayList<>();

	public String cadastraPessoa(String cpf, String nome, String email) throws Exception {
		Pessoa pessoa = new Pessoa(nome, email, cpf);
		pessoas.add(pessoa);
		return cpf;
	}

	public void getInfoPessoa(String cpf, String atributo) throws Exception {
		Pessoa pessoa = buscaPessoa(cpf);
		if (pessoa == null) {
			throw new Exception("Erro na consulta de pessoa: Pessoa nao encontrada");
		}

		if (atributo.equalsIgnoreCase("Nome")) {
			pessoa.getNome();
		}

		else if (atributo.equalsIgnoreCase("Email")) {
			pessoa.getEmail();
		} else {
			throw new Exception("Erro na atualizacao de pessoa: Atributo inexistente");
		}
	}

	private Pessoa buscaPessoa(String cpf) {
		for (Pessoa i : pessoas) {
			if (i.getCpf().equalsIgnoreCase(cpf)) {
				return i;
			}
		}
		return null;
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
			System.out.println(pessoas.get(i).getNome());
			System.out.println(pessoas.get(i).getEmail());
			System.out.println(pessoas.get(i).getCpf());
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
}