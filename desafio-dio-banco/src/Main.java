import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente teste = new Cliente();
		teste.setNome("Teste da Silva");
		//Cliente teste2 = new Cliente();
		//teste2.setNome("Teste Santos");
		
		Conta corrente = new ContaCorrente(teste);
		Conta poupanca = new ContaPoupanca(teste);
		List<Conta> contas = Conta.getContas();
		
		
		corrente.depositar(100);
		
		corrente.transferir(10, poupanca);
		
		// Cada conta em contas, retorna o extrato
		for(Conta conta : contas) {
			conta.extrato();
		}
		
		System.out.printf("Há %d contas existentes.", contas.size());
	}

}
