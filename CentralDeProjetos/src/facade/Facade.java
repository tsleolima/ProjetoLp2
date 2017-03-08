package facade;
import easyaccept.EasyAccept;
import CentralProjeto.CentralProjeto;

public class Facade {
	
	private CentralProjeto cp;
	
	public Facade(){
		cp = new CentralProjeto();
	}

	public void iniciaSistema(){}
	
	public String cadastraPessoa(String cpf,String nome,String email) throws Exception{
		return cp.cadastraPessoa(cpf, nome, email);
	}
	
	public String getInfoPessoa(String cpf,String atributo) throws Exception{
		return cp.getInfoPessoa(cpf, atributo);
	}
	
	public void editaPessoa(String cpf,String atributo,String valor) throws Exception{
		cp.atualizaPessoa(cpf, atributo, valor);
	}
	
	public void removePessoa(String cpf) throws Exception{
		cp.removePessoa(cpf);
	}
	
	public void listarPessoas(){
		cp.listarPessoas();
	}
	
	public void imprime(String cpf){
		cp.imprime(cpf);
	}
	
	public void fechaSistema(){}

	public static void main(String[] args) {
		args = new String[] {"facade.Facade", "acceptance_test/us1_test.txt", "acceptance_test/us1_test_exception.txt"} ;
		EasyAccept.main(args);
		
	}
}
