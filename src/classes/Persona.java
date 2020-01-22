package classes;

import java.util.Comparator;

public class Persona implements Comparable {

	private String nombre;
	private String apellidos;
	private int edad;

	public static final Comparator ORDENAR_POR_EDAD_ASC = new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {

			Persona p1 = (Persona) o1, p2 = (Persona) o2;

			return p1.getEdad() - p2.getEdad();
		}

	};
	public static final Comparator ORDENAR_POR_NOM_APE_EDAD = new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			Persona p1 = (Persona) o1, p2 = (Persona) o2;
			
			if(p1.getNombre().compareToIgnoreCase(p2.getNombre())==0) {
				if(p1.getApellidos().compareToIgnoreCase(p2.getApellidos())==0) {
					return p1.getEdad()-p2.getEdad();
				}else {
					return p1.getApellidos().compareToIgnoreCase(p2.getApellidos());
				}				
			}else {
				return p1.getNombre().compareToIgnoreCase(p2.getNombre());
			}
		}
		
	};
	public static final Comparator ORDENAR_POR_EDAD_DESC = new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {

			Persona p1 = (Persona) o1, p2 = (Persona) o2;

			return  p2.getEdad()-p1.getEdad();
		}

	};

	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Object o) {

		Persona p = (Persona) o;
		if (this.apellidos.compareToIgnoreCase(p.getApellidos()) == 0)
			return this.nombre.compareToIgnoreCase(p.getNombre());
		else
			return this.apellidos.compareToIgnoreCase(p.getApellidos());
	}
}
