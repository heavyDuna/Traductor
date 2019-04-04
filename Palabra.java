
public class Palabra implements Traducible {

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

	@Override
	public String toString() {
		return "Palabra: " + palabra;
	}

	@Override
	public void traduce() {
		// TODO Auto-generated method stub

	}

	@Override
	public double coste() {
		// TODO Auto-generated method stub
		return 0;
	}

}
