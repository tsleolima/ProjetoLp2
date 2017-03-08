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
	
	public void getInfoPessoa(String cpf,String atributo) throws Exception{
		cp.getInfoPessoa(cpf, atributo);
	}
	
	public void fechaSistema(){}

	public static void main(String[] args) {
		args = new String[] {"facade.Facade", "acceptance_test/us1_test.txt"} ;
		EasyAccept.main(args);
		
	}
}
