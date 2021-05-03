
public class AplicaDesconto {
	
	private double desconto;
	
	public void aplica(Veiculo v) {
		double valorADescontar = v.getDesconto();
		this.desconto = valorADescontar;
		v.setPreco(v.getPreco() - valorADescontar);		
	}
	
}
