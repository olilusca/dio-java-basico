public class Contador {
	
	public void contar(int num1, int num2) throws ParametrosInvalidosException {
		
		if(num1 > num2) { 
			throw new ParametrosInvalidosException();
		} else {
			int contagem = num2 - num1;

			for(int x = 0; x < contagem; x++) {
				System.out.println("Imprimindo: " + (x+1));
			}
			
		}

	}

}
