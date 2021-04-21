package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int cantidadFabricantes = 0;
	private static ArrayList<Fabricante> lista = new ArrayList<Fabricante>(); 
	
	// constructores
	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		lista.add(this);
	}
	
	public Fabricante() {
		this.nombre = null;
		this.pais = null;
		lista.add(this);
		
	}
	
	//getters and setters
	
	public int getCantidadFabricantes() {
		return this.cantidadFabricantes;
	}

	public void setCantidadFabricantes(int cantidadFabricantes) {
		this.cantidadFabricantes = cantidadFabricantes;
	}

	public static ArrayList<Fabricante> getLista() {
		return lista;
	}

	public static void setLista(ArrayList<Fabricante> lista) {
		Fabricante.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	// Metodos maximo fabricante
	
	public static String fabricaMayorVentas() {
		Fabricante ganador = new Fabricante();
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getCantidadFabricantes()> ganador.getCantidadFabricantes()) {
				ganador = lista.get(i);
			}
		}
		return ganador.getNombre();
	}
	
	

}
