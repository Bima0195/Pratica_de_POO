package exercicio011;

import java.util.Scanner;

public class QuartoEstudade {
	
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     
	     int N = sc.nextInt();
	     String[] estudante = new String[N];
	     String[] email = new String[N];
	     int quarto[] = new int[10];
	     
	     
	     for(int i=0; i<N; i++) {
	    	 System.out.print("Nome: ");
	    	 estudante[i] = sc.nextLine();	    	 
	    	 System.out.printf("Email: %n");
	    	 email[i] = sc.nextLine();    	 
	    	 System.out.println("Quarto: ");
	    	 quarto[i] = sc.nextInt();
	    	 sc.nextLine();
	    	 
	     }
	     
	     for(int i=0; i<N; i++) {
	      	if(quarto != null) {
	      		System.out.printf("%d: %s, %s", quarto,estudante[i], email[i]);
	      	}
	     }
	     
	     
	     
	     sc.close();
	}

}
