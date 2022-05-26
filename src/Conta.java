public abstract class Conta implements iConta {
	
	private static final int AG_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int ContaNumero;
	protected double saldo;
	
	

	public Conta() {
		this.agencia = Conta.AG_PADRAO;
		this.ContaNumero = SEQUENCIAL++;
	}	
	@Override
	public void sacar(double valor) {
		 saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		 saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		 this.sacar (valor);
		 contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getContaNumero() {
		return ContaNumero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void printExtratoInf() {
		System.out.println(String.format("Agencia:  %d",this.agencia));
		System.out.println(String.format("Número da Conta:  %d",this.ContaNumero));
		System.out.println(String.format("Saldo:  %.2f",this.saldo));
	}
}

