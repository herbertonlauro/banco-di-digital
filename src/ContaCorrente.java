public class ContaCorrente extends Conta {

	@Override
	public void PrintExtrato() {
		System.out.println("===== Extrato Conta Corrente ====");
		super.printExtratoInf();
	}

	
	
}