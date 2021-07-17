public class ContadorOperacoes implements InterfaceContador {
	int numero;
	@Override
	public void inicializar(int n) {
		numero = n;
		
	}

	@Override
	public int acessar() {
		return numero;
	}

	@Override
	public void incrementar() {
		numero =  numero+1;
		
	}

	@Override
	public void decrementar() {
		numero =  numero-1;
		
	}

}