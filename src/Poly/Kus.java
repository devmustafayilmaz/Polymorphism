
package Poly;

public class Kus extends Hayvan {

	public Kus(String adi) {
		super(adi);
	}

	@Override
	public void sesCikar() {
				System.out.println(this.getAdi()+" cik cik dedi !");
	}

}
