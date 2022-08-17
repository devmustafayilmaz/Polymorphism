package Poly;

public class Main {
	
	
	public static void hayvaniKonustur(Hayvan hayvan) {
		
		hayvan.sesCikar();
		
	}

	public static void main(String[] args) {
		
		

		
		Hayvan hayvan1 = new Hayvan("Felix");
		
		Kedi kedi1 = new Kedi("Tekir");
		
		Kopek kopek1 =new Kopek("Çomar");
		
		Kus kus1 = new Kus("Tweety");
		
		hayvaniKonustur(kus1);
		hayvaniKonustur(kopek1);
		hayvaniKonustur(kedi1);
		hayvaniKonustur(hayvan1);
	 /* hayvan1.sesCikar();
		kedi1.sesCikar();
		kopek1.sesCikar();
		kus1.sesCikar(); */

	}

}
