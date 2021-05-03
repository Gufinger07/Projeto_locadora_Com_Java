
public class Moto extends Veiculo {
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public double getDesconto() {
		return this.getPreco() * 0.10;
	}

	
	  
}

