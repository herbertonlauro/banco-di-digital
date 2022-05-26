public class ContaPoupanca extends Conta  {
	
	@Override
	public void PrintExtrato() {
		System.out.println("===== Extrato Conta Poupanca ====");
		super.printExtratoInf();
	}
}
