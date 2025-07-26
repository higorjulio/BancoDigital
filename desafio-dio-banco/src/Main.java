
public class Main {

	public static void main(String[] args) {
		Cliente teste = new Cliente();
		teste.setNome("Teste da Silva");
		
		Conta corrente = new ContaCorrente(teste);
		Conta poupanca = new ContaPoupanca(teste);
		
		corrente.depositar(100);
		
		corrente.transferir(10, poupanca);
		corrente.extrato();
		poupanca.extrato();
	}

}
