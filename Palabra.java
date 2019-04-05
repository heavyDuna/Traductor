
public class Palabra implements Traducible, Comparable {

	private String palabra;

	public Palabra() {

		this.palabra = palabra;
	}

	public Palabra(String palabra) {

		this.palabra = palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getPalabra() {
		return palabra;
	}

	@Override
	public String toString() {
		return "Palabra: " + palabra;
	}

	@Override
	public String traduce(Diccionario d) {
		return palabra;
		// TODO Auto-generated method stub

	}

	@Override
	public double coste() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		Palabra t = (Palabra) o;

		return this.palabra.compareTo(t.palabra);

	}

}
