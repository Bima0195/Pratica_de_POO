package program;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {


		Conta conta = new Conta(1000, "Bima", 0.0);
		ContaEmpresa contaEmp = new ContaEmpresa(1001,"Teste",0.0, 1000.00);
		
		//UpCasting -> Nesse caso é pegar um objeto do tipo ContaEmpresa e atribuir para uma variavel do tipo Conta
		Conta conta1 = contaEmp;
		Conta conta2 = new ContaEmpresa(1002,"Teste",0.0, 1000.00);
		Conta conta3 = new ContaPoupanca(1003,"Eli", 0.0, 0.01);
		
		
		//DownCasting -> É converter um objeto da super classe para uma subclase	
		ContaEmpresa conta4 = (ContaEmpresa)conta2;
		conta4.emprestimo(100.00);
		
		if(conta3 instanceof ContaEmpresa) {
			ContaEmpresa conta5 =  (ContaEmpresa)conta3;
			conta5.emprestimo(100.00);
			System.out.println("Emprestimo");
		}
		
		if(conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca)conta3;
			conta5.atualizarSaldo();
			System.out.println("Atualizado");
		}
		
		//Sobreposição do metodo Saque
		Conta conta6 = new Conta(1006, 	"Mael", 100.00);
		conta6.saque(10.00);		
		System.out.println(conta6.getSaldo());
		
		Conta conta7 = new ContaPoupanca(1008, "Maria", 100.00, 0.001);
		conta7.saque(10.00);
		System.out.println(conta7.getSaldo());
		
		//Palavra Super
		Conta conta8 = new ContaEmpresa(1010, "Predo", 1000.00, 500.00);
		conta8.saque(200.00);
		System.out.println(conta8.getSaldo());

	}

}
