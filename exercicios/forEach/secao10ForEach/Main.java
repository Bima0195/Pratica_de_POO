package secao10ForEach;

public class Main {
	
	public static void main(String[] args) {
		
		String[] vet = new String[]{"Maria", "Bobe", "Alex"};
		
		for(int i=0; i<vet.length; i++) {
			System.out.println(vet[i]);
			
			System.out.println(">**************************************************************");
			for(String qualquernome: vet) {
				System.out.println(qualquernome);
			}
			
		}
		
	}

}
