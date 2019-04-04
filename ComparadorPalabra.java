import java.util.Comparator;

public class ComparadorPalabra implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Palabra p1 = (Palabra) o1;
		Palabra p2 = (Palabra) o2;

		return p1.getPalabra().compareTo(p2.getPalabra());

	}

}