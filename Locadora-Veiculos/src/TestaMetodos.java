
public class TestaMetodos {

	public static void main(String[] args) {
		Veiculo moto = new Veiculo();
		moto.setPreco(300.0);
	
		Veiculo veloster = new Veiculo();
		veloster.setPreco(130000.0);
		System.out.println(veloster.getPreco());
		
		AplicaDesconto descontando = new AplicaDesconto();
		descontando.aplica(veloster);
		System.out.println(veloster.getPreco());
		 
		Veiculo lancer = new Carro();
		lancer.setPreco(4000.0);
		System.out.println(lancer.getPreco());
		descontando.aplica(lancer);
		System.out.println(lancer.getPreco());
		lancer.setModelo("Lancer");
		PrecoAlugar precoDiario = new PrecoAlugar();
		precoDiario.aplicaPrecoDiario(lancer);
		
		
		


	}

}
