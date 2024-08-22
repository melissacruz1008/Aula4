package entidade;

public class poupança extends Conta {

	public poupança(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
	}

	@Override
	public String toString() {
		return "poupança " + mostrar();
	}

	
	
}
