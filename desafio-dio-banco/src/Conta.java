import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	private static List<Conta> contas = new ArrayList<>();
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo = 0;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
		contas.add(this);
	}
	
	
	public static List<Conta> getContas() {
		return contas;
	}


	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	public void extrato() {
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Número: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
