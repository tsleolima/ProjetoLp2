package CentralProjeto;

import java.util.ArrayList;
import java.util.List;

import Pessoa.Pessoa;

public class Facade {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		public boolean criarPessoa(Pessoa pessoa){
			try{
				pessoas.add(pessoa);
			}catch (Exception e) {
				return false;
			}
			return true;
		}
		
		public boolean apagarPessoa(Pessoa pessoa){
			try{
				pessoas.remove(pessoa);
			}catch (Exception e) {
				return false;
			}
			return true;
		}
		
		public void listarPessoas(){
			for (int i = 0; i < pessoas.size(); i++){
				System.out.println(pessoas.get(i).getNome());
				System.out.println(pessoas.get(i).getEmail());
				System.out.println(pessoas.get(i).getCpf());
			}
		}
		
		public void editarPessoa(){
			// nao faço ideia de como ele queira isso
		}
}