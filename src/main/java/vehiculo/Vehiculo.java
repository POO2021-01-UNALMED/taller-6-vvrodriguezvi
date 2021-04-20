package vehiculo;

public class Vehiculo {
	String placa;
	static int puertas;
	static int velocidadMaxima;
	String nombre; // como llaman al vehiculo
	long precio;
	long peso;
	static String traccion;
	Fabricante fabricante;
	
	// contructores
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, long precio, long peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}
	public Vehiculo(int puertas, int velocidadMaxima, String traccion) {
		this.puertas = puertas ;
		this.velocidadMaxima = velocidadMaxima;
		this.traccion = traccion;
	}
	public Vehiculo(int velocidadMaxima, String traccion) {
		this.velocidadMaxima = velocidadMaxima;
		this.traccion = traccion;

	}
	
	
	// Getters  and  setters
	
	public Vehiculo(String placa, String nombre, Fabricante fabricante) {
		super();
		this.placa = placa;
		this.nombre = nombre;
		this.fabricante = fabricante;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public static int getPuertas() {
		return puertas;
	}
	public static void setPuertas(int puertas) {
		Vehiculo.puertas = puertas;
	}
	public static int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public static void setVelocidadMaxima(int velocidadMaxima) {
		Vehiculo.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public long getPeso() {
		return peso;
	}
	public void setPeso(long peso) {
		this.peso = peso;
	}
	public static String getTraccion() {
		return traccion;
	}
	public static void setTraccion(String traccion) {
		Vehiculo.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	
	
	
	

}
