
public class Main {

	public static void main(String[] args) {

		Texto t1 = new Texto();
		Palabra p1 = new Palabra();
		Palabra p2 = new Palabra();
		Palabra p3 = new Palabra();

		p1.setPalabra("payaso");
		p2.setPalabra("imbecil");
		p3.setPalabra("monguer");
		t1.addPalabra(p1);
		t1.addPalabra(p2);
		t1.addPalabra(p3);

		System.out.println(t1);
		
		Libro l1 = new Libro();

	}

}
