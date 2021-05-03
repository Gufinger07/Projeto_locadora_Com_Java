public class Veiculo {
	private String modelo;
	private double preco;
	private byte rodas;
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public byte getRodas() {
		return rodas;
	}
	
	public void setRodas(byte rodas) {
		this.rodas = rodas;
		
	}
	
	public double getDesconto() {
		return this.getPreco() * 0.05;
	}
	
	
	

	
}
