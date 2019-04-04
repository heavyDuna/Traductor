
public class Libro implements Traducible {

	private Traducible[] libro;

	public Libro() {

		this.libro = new Libro[10];
	}

	public Libro(Traducible[] libro) {

		this.libro = libro;
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
