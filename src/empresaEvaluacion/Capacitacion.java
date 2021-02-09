package empresaEvaluacion;

// Clase Capacitaci�n 
public class Capacitacion {

	private Integer identificador;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private Integer duracion;
	private Integer cantidadAsistentes;
	// parametro para generar relacion de asociacion con Cliente
	private Cliente clienteCapacitacion;

	public Capacitacion(Integer identificador, Integer rutCliente, String dia, String hora, String lugar,
			Integer duracion, Integer cantidadAsistentes) {
		this.identificador = identificador;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public Capacitacion() {

	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
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

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Integer getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(Integer cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	// metodo mostrar detalle, entrega informaci�n de la capacitaci�n y duraci�n en
	// minutos.
	String mostrarDetalle() {
		String detalle;

		detalle = "La capacitacion ser� en " + lugar + " a las " + hora + ", del d�a " + dia + " y durar� "
				+ duracion * 60 + " minutos";

		return detalle;
	}

	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}

}
