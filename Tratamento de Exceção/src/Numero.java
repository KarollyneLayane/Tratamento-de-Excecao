
public class Numero {
	
	int num1, num2;
	
	Numero() {
		
	}
	
	public void validaNumeros() throws Exception {
		if (num1 <= 0) {
		
			throw new Exception("O primeiro número informado precisa ser mair do que zero!");
			
		}else if (num2 <= 0) {
			
			throw new Exception("O segundo número informado precisa ser mair do que zero!");
		
		}
	}
	
	public double dividir() {
		return num1/num2;
	}

}
