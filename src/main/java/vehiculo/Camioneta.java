package vehiculo;

public class Camioneta extends Vehiculo{
	boolean volco;
	private static int cantidadCamionetas = 0;
	
	// constructores

	public Camioneta(String placa, int puertas, String nombre, long precio, long peso,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4" , fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	
	// getters and setters

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}
	
	// Metodos

	
	
	

}