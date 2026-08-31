package datos;

public class Desarmable extends UnidadVenta {

	private int cantCarpas;
	private int tiempoArmado;

	public Desarmable() {}


	public Desarmable(String nombre, String lugar, long superficie, Staff encargado, String codigo, Festival festival,
			int cantCarpas, int tiempoArmado) {
		super(nombre, lugar, superficie, encargado, codigo, festival);
		this.cantCarpas = cantCarpas;
		this.tiempoArmado = tiempoArmado;
	}



	public int getCantCarpas() {
		return cantCarpas;
	}

	public void setCantCarpas(int cantCarpas) {
		this.cantCarpas = cantCarpas;
	}

	public int getTiempoArmado() {
		return tiempoArmado;
	}

	public void setTiempoArmado(int tiempoArmado) {
		this.tiempoArmado = tiempoArmado;
	}

	@Override
	public String toString() {
		return "Desarmable [" + super.toString() + ", cantCarpas=" + cantCarpas + ", tiempoArmado=" + tiempoArmado
				+ "]";
	}
}
