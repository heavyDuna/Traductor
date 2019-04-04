
public class Lista {

	private Nodo com;

	public Lista() {

		this.com = null;
	}

	public Nodo getCom() {
		return this.com;
	}

	public void setCom(Nodo com) {
		this.com = com;
	}

	public void addPrincipio(Palabra p) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(p);
		nuevo.setSig(this.com);
		this.com = nuevo;
	}

	public void add(Palabra p) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(p);
		Nodo n = this.com;

		if (n == null) {

			this.addPrincipio(p);

		} else {

			while (n.getSig() != null) {

				n = n.getSig();
			}

			n.setSig(nuevo);

		}
	}



	public String toString() {

		String l = "Lista";
		Nodo p = this.com;

		while (p != null) {

			l = l+p;
			p = p.getSig();
		}

		return l;

	}
}
