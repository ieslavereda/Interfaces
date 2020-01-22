package classes;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {

		Persona p1 = new Persona("Joaquin", "Alonso Saiz", 42);
		Persona p2 = new Persona("Manolo", "Garcia Lopez", 34);
		Persona p3 = new Persona("Luis", "Abellan Lopez", 24);
		Persona p4 = new Persona("Carlos", "Garcia Lopez", 65);

		Persona[] personas = { p1, p2, p3, p4 };

		Arrays.sort(personas, (per1,per2)->per1.getEdad()-per2.getEdad());
		
		

		for (int i = 0; i < personas.length; i++)
			System.out.println(personas[i]);

	}

}
