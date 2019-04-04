
public class Texto implements Traducible {

	private Lista texto;

	public Texto() {

		this.texto = new Lista();
	}

	public Texto(Lista texto) {

		this.texto = texto;
	}

	public void addPalabra(Palabra p) {

		this.texto.add(p);

	}

	@Override
	public String toString() {
		return "Texto: "+ texto;
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
