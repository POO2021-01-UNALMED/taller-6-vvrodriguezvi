package vehiculo;

public class Automovil extends Vehiculo{
	int puestos;

	public Automovil(int puestos) {
		super(puertas, velocidadMaxima, traccion);
		Vehiculo.puertas = 4;
		Vehiculo.velocidadMaxima = 100;
		Vehiculo.traccion = "FWD";
	}
	
}
