
public class main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cp.transferir(20, cc);
		cc.transferir(110, cp);	
		cp.depositar(200); 
		cp.sacar(50);
		cc.depositar(1000);
		
		
		
		cc.PrintExtrato();
		cp.PrintExtrato();
	}

}
