package vehiculos;
import java.util.*;


public class Pais {
	private String nombre;
	private static ArrayList<Pais> listaP = new ArrayList<Pais>(); 
	private int cantidadPaises = 0;
	
	// constructores
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listaP.add(this);
	}
	public Pais() {
		
		listaP.add(this);
	}
	

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static ArrayList<Pais> getListaP() {
		return listaP;
	}
	public static void setListaP(ArrayList<Pais> listaP) {
		Pais.listaP = listaP;
	}
	public int getCantidadPaises() {
		return cantidadPaises;
	}
	public void setCantidadPaises(int cantidadPaises) {
		this.cantidadPaises = cantidadPaises;
	}
	
	// metodos
	
	
	public static Pais paisMasVendedor() {
		Pais ganador = new Pais();
		for(int i = 0; i < listaP.size(); i++) {
			if(listaP.get(i).getCantidadPaises()> ganador.getCantidadPaises()) {
				ganador = listaP.get(i);
			}
		}
		return ganador;
	}
	
}
