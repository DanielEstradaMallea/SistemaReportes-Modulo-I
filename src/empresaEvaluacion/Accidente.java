package empresaEvaluacion;

// Clase para los accidentes
public class Accidente {

	private String identificador;
	private String d�aSemana;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencia;
	// parametro para generar relacion de asociacion con Cliente
	private Cliente clientesAccidente;

	public Accidente(String identificador, String rutCliente, String d�aSemana, String hora, String lugar,
			String origen, String consecuencia) {
		this.identificador = identificador;
		this.d�aSemana = d�aSemana;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencia = consecuencia;
	}

	public Accidente() {
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getD�aSemana() {
		return d�aSemana;
	}

	public void setD�aSemana(String d�aSemana) {
		this.d�aSemana = d�aSemana;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencia() {
		return consecuencia;
	}

	public void setConsecuencia(String consecuencia) {
		this.consecuencia = consecuencia;
	}

	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", d�aSemana=" + d�aSemana + ", hora=" + hora + ", lugar="
				+ lugar + ", origen=" + origen + ", consecuencia=" + consecuencia + "]";
	}

}
