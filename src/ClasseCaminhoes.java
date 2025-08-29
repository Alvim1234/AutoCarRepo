
public class ClasseCaminhoes extends ClasseAutomotores{
	float cargaSuportadaAt;

	
	public ClasseCaminhoes(String corPar, String marcaPar, String modeloPar, String tipoPar, float cargaSuportadaPar) {

		super(corPar, marcaPar, modeloPar, tipoPar);
		this.cargaSuportadaAt = cargaSuportadaPar;

	}
	public float pegarCargaSuportada() {
	    return cargaSuportadaAt;
	}
	
	public void alterarCargaSuportada(float cargaSuportadaPar) {
	    this.cargaSuportadaAt = cargaSuportadaPar;
	}
}