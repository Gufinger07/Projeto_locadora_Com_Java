
public class Carro extends Veiculo {
	private byte portas;

	public byte getPortas() {
		return portas;
	}

	public void setPortas(byte portas) {
		this.portas = portas;
	}
	
	public double getDesconto() {
		return this.getPreco() * 0.20;
	}
	
	
}
