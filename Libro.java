
public class Libro implements Traducible {

	private Traducible[] libro;

	public Libro() {

		this.libro = new Libro[10];
	}

	public Libro(Traducible[] libro) {

		this.libro = libro;
	}

	@Override
	public String traduce(Diccionario d) {
		return null;

	}

	@Override
	public double coste() {

		return 0;
	}

}
