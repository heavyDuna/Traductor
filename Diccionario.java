import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Diccionario {

	private SortedMap diccionario;

	public Diccionario() {
		this.diccionario = new TreeMap();
	}

	public void add(Palabra pal, Palabra palab) {

		this.diccionario.put(pal, palab);
	}

	public Palabra traduce(Palabra pal) {

		Palabra palab;

		palab = (Palabra) this.diccionario.get(pal);

		return palab;
	}

	@Override
	public String toString() {
		return "Diccionario: " + diccionario;
	}

}
