package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int cantidadFabricantes = 0;
	private static ArrayList<Fabricante> lista = new ArrayList<Fabricante>(); 
	
	// constructores
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		lista.add(this);
		cantidadFabricantes++;
	}
	
	public Fabricante() {
		this.nombre = null;
		this.pais = null;
		lista.add(this);
		cantidadFabricantes++;
	}
	
	//getters and setters

	public String getNombre() {
		return this.nombre;
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

	public int getCantidadFabricantes() {
		return cantidadFabricantes;
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
	
	
	// Metodos maximo fabricante
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante ganadorF = new Fabricante();
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getCantidadFabricantes() > ganadorF.getCantidadFabricantes()) {
				ganadorF = lista.get(i);
			}
		}
		return ganadorF;
	}

}
