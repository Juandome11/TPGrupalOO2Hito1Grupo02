package datos;

import java.time.LocalDate;

public class Cocinero extends Staff {

	private String especialidad;
	private String certificado;

	public Cocinero() {}

	public Cocinero(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, long sueldoBase, String especialidad, String certificado) {
		super(nombre, apellido, dni, edad, fechaNacimiento, fechaIngreso, sueldoBase);
		this.especialidad = especialidad;
		this.certificado = certificado;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	@Override
	public String toString() {
		return "Cocinero [" + super.toString() + ", especialidad=" + especialidad + ", certificado=" + certificado
				+ "]";
	}
}
