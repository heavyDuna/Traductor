
public class Texto implements Traducible {

	private Lista texto;

	public Texto() {

		this.texto = new Lista();
	}

	public Texto(Lista texto) {

		this.texto = texto;
	}

	public void addTexto(String t) {

		this.texto.dividir(t);

	}

	@Override
	public String toString() {
		return "Texto: " + texto;
	}

	@Override
	public String traduce(Diccionario d) {

		Nodo p;
		p = this.texto.getCom();
		String pals = " ";
		while (p != null) {

			pals = pals + d.traduce(p.getInfo());
			p = p.getSig();
		}
		
		return pals;

	}

	@Override
	public double coste() {
		// TODO Auto-generated method stub
		return 0;
	}
}
