
public class ClasseAutomotores {

	String corAt;
	String marcaAt;
	String modeloAt;
	String tipoAt;

public ClasseAutomotores() {
	
	}
public ClasseAutomotores(String corPar, String marcaPar, String modeloPar, String tipoPar) {
		
	this.corAt = corPar;
	this.marcaAt = marcaPar;
	this.modeloAt = modeloPar;
	this.tipoAt = tipoPar;
	
	}

	public String pegarCor() {
	    return corAt;
	}
	
	public void alterarCor(String corPar) {
	    this.corAt = corPar;
	}
	
	public String pegarMarca() {
	    return marcaAt;
	}
	
	public void alterarMarca(String marcaPar) {
	    this.marcaAt = marcaPar;
	}
	
	public String pegarModelo() {
	    return modeloAt;
	}
	
	public void alterarModelo(String modeloPar) {
	    this.modeloAt = modeloPar;
	}
	
	public String pegarTipo() {
	    return tipoAt;
	}
	
	public void alterarTipo(String tipoPar) {
	    this.tipoAt = tipoPar;
	}
}
