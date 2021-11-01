package zadatak1;

public class TestTezinaClanovaEkipe {
public static void main(String[] args) {
	TezineClanovaEkipe tce = new TezineClanovaEkipe(5);
	//stavili smo kapacitet 5
	tce.unesi(45.0);
	tce.unesi(55.0);
	tce.unesi(56.0);
	tce.unesi(65.0);
	
	
	tce.ispisi();
	tce.ispisiKategorije();
	tce.pronadjiNajlakseg();
	
	System.out.println("Najlaksi je: "  + 	tce.pronadjiNajlakseg());
}
}
