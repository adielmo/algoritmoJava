package br.com.avancado;

public class Pessoa {
	
	private TipoDocuemnto tipoDocumento;
	private String numeroDocumento;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(TipoDocuemnto tipoDocumento, String numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDocuemnto getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocuemnto tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public String toString() {
		return "Pessoa [numeroDocumento=" + numeroDocumento + "]";
	}
	
	
	

}
