package datos;


import java.util.Set;

public abstract class UnidadVenta {

	protected long idUnidadVenta;
	protected String nombre;
	protected String lugar;
	protected Staff responsableCargo;
	protected long superficie;
	protected String codigo;
	protected Set<Staff> staff;
	protected Set<Plato> platos;

	public UnidadVenta() {}

	public UnidadVenta(String nombre, String lugar, Staff responsableCargo, long superficie, String codigo) {
		this.nombre = nombre;
		this.lugar = lugar;
		this.responsableCargo = responsableCargo;
		this.superficie = superficie;
		this.codigo = codigo;
	}

	public long getIdUnidadVenta() {
		return idUnidadVenta;
	}

	protected void setIdUnidadVenta(long idUnidadVenta) {
		this.idUnidadVenta = idUnidadVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Staff getResponsableCargo() {
		return responsableCargo;
	}

	public void setResponsableCargo(Staff responsableCargo) {
		this.responsableCargo = responsableCargo;
	}

	public long getSuperficie() {
		return superficie;
	}

	public void setSuperficie(long superficie) {
		this.superficie = superficie;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Set<Staff> getStaff() {
		return staff;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	public Set<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(Set<Plato> platos) {
		this.platos = platos;
	}

	// Pendiente implementar lógica de negocio (validación propia del código de 10 caracteres)
	public boolean validarCodigo(String codigo) {
		throw new UnsupportedOperationException("Pendiente de implementar");
	}

	@Override
	public String toString() {
		return "UnidadVenta [idUnidadVenta=" + idUnidadVenta + ", nombre=" + nombre + ", lugar=" + lugar
				+ ", superficie=" + superficie + ", codigo=" + codigo + "]";
	}
}
