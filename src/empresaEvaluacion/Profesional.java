package empresaEvaluacion;

// Clase Profesional 
public class Profesional extends Usuario {

	private String titulo;
	private String fechaIngreso;

	public Profesional(String nombre, String fechaNacimiento, Integer run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public Profesional() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}

	// metodo analizar usuario implementado por asesoria. Devuelve titulo y fecha de
	// ingreso junto con datos de usuario
	@Override
	public void analizarUsuario() {

		super.analizarUsuario();
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Fecha de ingreso: " + getFechaIngreso());
	}

}
