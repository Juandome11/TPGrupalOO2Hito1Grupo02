package datos;

import java.time.LocalDate;

public abstract class Staff {

	protected long idStaff;
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected int edad;
	protected LocalDate fechaNacimiento;
	protected LocalDate fechaIngreso;
	protected long sueldoBase;

	public Staff() {}

	public Staff(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, long sueldoBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.sueldoBase = sueldoBase;
	}

	public long getIdStaff() {
		return idStaff;
	}

	protected void setIdStaff(long idStaff) {
		this.idStaff = idStaff;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public long getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(long sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	// Pendiente implementar lógica de negocio
	public Long antiguedad() {
		throw new UnsupportedOperationException("Pendiente de implementar");
	}

	// Pendiente implementar lógica de negocio (debe ser mayor de edad)
	public boolean validarEdad() {
		throw new UnsupportedOperationException("Pendiente de implementar");
	}

	@Override
	public String toString() {
		return "Staff [idStaff=" + idStaff + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso
				+ ", sueldoBase=" + sueldoBase + "]";
	}
}
