import java.util.ArrayList;

public class OperacoesPessoa {
	ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa p) {
		pessoa.add(p);
	}
	
	public String consultaPessoa(String nome) {
		for(Pessoa p : pessoa) {
			if(p.nome.equals(nome)) {				
				return p.toString();
			}
		}
		return null;
	}
	
	public void RemoverPessoa(String nome) {
		Pessoa pe = null;
		for(Pessoa p : pessoa) {
			if(p.nome.equals(nome)) {				
				pe = p;
			}
			
		}
		if(pe != null) {
			pessoa.remove(pe);
		}
	}
	

}