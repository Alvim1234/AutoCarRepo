
public class ClasseCarros extends ClasseAutomotores{

	int quantportasAt;
	
	public ClasseCarros(String corPar, String marcaPar, String modeloPar, String tipoPar, int quantportasPar) {

		super(corPar, marcaPar, modeloPar, tipoPar);
		this.quantportasAt = quantportasPar;
	}
	public int pegarQuantportas() {
	    return quantportasAt;
	}
	
	public void alterarQuantport(int quantportasPar) {
	    this.quantportasAt = quantportasPar;
	}
}
