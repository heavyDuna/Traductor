
public class Main {

	public static void main(String[] args) {

		Texto t1 = new Texto();
		Palabra p1 = new Palabra();
		Palabra p2 = new Palabra();
		Palabra p3 = new Palabra();

		t1.addTexto("hola perro");

		//System.out.println(t1);

		Diccionario d1 = new Diccionario();
		Palabra p4 = new Palabra();
		Palabra p5 = new Palabra();
		p4.setPalabra("perro");
		p5.setPalabra("dog");

		Palabra p6 = new Palabra("hola");
		Palabra p7 = new Palabra("hello");
		d1.add(p4, p5);
		d1.add(p6, p7);

		//System.out.println(d1);
		//System.out.println(d1.traduce(p6));
		System.out.println(t1.traduce(d1));

	}

}
