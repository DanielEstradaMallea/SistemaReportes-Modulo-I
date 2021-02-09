package empresaEvaluacion;
// clase revision 
public class Revision {

	private String identificadorRevision;
	private String IdentificadorVisitaTerreno;
	private String nombreRevision;
	private String detalle;
	private Integer estado; // 1 (sin problemas), 2 (con observaciones), 3 (no aprueba),
	public Revision() {
		super();
	}
	public Revision(String identificadorRevision, String identificadorVisitaTerreno, String nombreRevision,
			String detalle, Integer estado) {
		this.identificadorRevision = identificadorRevision;
		IdentificadorVisitaTerreno = identificadorVisitaTerreno;
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}
	public String getIdentificadorRevision() {
		return identificadorRevision;
	}
	public void setIdentificadorRevision(String identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}
	public String getIdentificadorVisitaTerreno() {
		return IdentificadorVisitaTerreno;
	}
	public void setIdentificadorVisitaTerreno(String identificadorVisitaTerreno) {
		IdentificadorVisitaTerreno = identificadorVisitaTerreno;
	}
	public String getNombreRevision() {
		return nombreRevision;
	}
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Revision [identificadorRevision=" + identificadorRevision + ", IdentificadorVisitaTerreno="
				+ IdentificadorVisitaTerreno + ", nombreRevision=" + nombreRevision + ", detalle=" + detalle
				+ ", estado=" + estado + "]";
	}
	
}
