package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceiro;

public class Main {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    List<Funcionario> list = new ArrayList<>();
	    
	    System.out.print("Numero de funcionarios: ");
	    int N = sc.nextInt();
	    
	    for(int i=1; i<=N; i++) {
	    	System.out.println("Dados do funcionario: #" + i);
	    	System.out.print("O funcionario é terceiro?: s/n: ");
	    	char ch = sc.next().charAt(0);
	    	System.out.print("Nome: ");
	    	sc.nextLine();
	    	String nome = sc.nextLine();
	    	System.out.print("Horas: ");
	    	int horas = sc.nextInt();
	    	System.out.print("Valor por hora: ");
	    	double valorHora = sc.nextDouble();
	    	
	    	// Posso fazer de duas maneiras a instanciação funcionario na lista
	    	if(ch == 's') {
	    		System.out.print("Despesa adicional: ");
	    		double despesa = sc.nextDouble();
	    		
	    		//Exemplo 1
	    	    list.add(new FuncionarioTerceiro(nome, horas, valorHora, despesa));
	    	}
	    	else {
	    		//Exemplo 2
	    		Funcionario func = new Funcionario(nome, horas, valorHora);
	    		list.add(func);
	    	}
	    }
	    
	    System.out.println();
	    System.out.println("Pagamento: ");
	    for(Funcionario func: list) {
	    	System.out.println(func.getNome() + " - $" + String.format("%.2f", func.pagamento()));
	    }
	    
	    
	    
	    sc.close();
	}

}
