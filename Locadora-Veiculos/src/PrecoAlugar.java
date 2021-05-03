
public class PrecoAlugar {

	private double precoPorDia;
	
	public void aplicaPrecoDiario(Veiculo v) {
		precoPorDia = v.getPreco() % 1000;
	}
		
}
