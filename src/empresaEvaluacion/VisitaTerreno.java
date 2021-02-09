package empresaEvaluacion;
// Clase Visita a terreno 
public class VisitaTerreno extends Cliente {

	private String identificadorTerreno;
	private String día;
	private String hora;
	private String lugar;
	private String comentario;
	// parametro para generar relacion de asociacion con Cliente
	private Cliente clienteVisita;

	public VisitaTerreno(String nombre, String fechaNacimiento, Integer run, Integer rut, String nombres,
			String apellidos,
			Integer telefono, String afp, Integer salud, String direccion, String comuna,
			Integer edad, String identificadorTerreno, String rutCliente, String día, String hora, String lugar,
			String comentario) {
		super(nombre, fechaNacimiento, run, rut, nombres, apellidos, telefono, afp, salud, direccion, comuna, edad);
		this.identificadorTerreno = identificadorTerreno;
		this.día = día;
		this.hora = hora;
		this.lugar = lugar;
		this.comentario = comentario;
	}


	public VisitaTerreno() {
	}


	public String getIdentificadorTerreno() {
		return identificadorTerreno;
	}

	public void setIdentificadorTerreno(String identificadorTerreno) {
		this.identificadorTerreno = identificadorTerreno;
	}


	public String getDía() {
		return día;
	}

	public void setDía(String día) {
		this.día = día;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [identificadorTerreno=" + identificadorTerreno  + ", día="
				+ día + ", hora=" + hora + ", lugar=" + lugar + ", comentario=" + comentario + "]";
	}

}
