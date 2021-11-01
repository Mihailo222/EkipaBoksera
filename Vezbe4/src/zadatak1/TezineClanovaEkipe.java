package zadatak1;

public class TezineClanovaEkipe {
	
	
	
	
	//napravi atribut nizTezina koji predstavlja niz tezina clanova
	//bokserske ekipe u kg
	double[] nizTezina;
 
	//napravi atribut brojac koji predstavlja stvarni trenutni broj clanova 
	//ekipe, pocetna vrednost nula.
	int brojac = 0;

    
	//konstruktor koji inicijalizuje niz tezina na kapacitet 20 i 
	//postavlja vrednost svih elemenata niza na -1
   
	// mora se naziv konstruktora poklapati sa nazivom klase
	TezineClanovaEkipe(){
		nizTezina = new double[20];
		//bez definisanja ovog kapaciteta, iskakala bi greska za 
		//sve one fje .length koje smo pozival!!!
		//ona crvena slova.....
		for (int i=0; i<nizTezina.length;i++) {
			nizTezina[i]=-1;
	}
	}
	
	
	
	//Napraviti konstruktor koji inicijalizuje niz tezina na 
	//kapacitet 20 i postavlja vrednost svih 20 elemenata niza na-1
	// tip parametrizovanog konstruktora koji zna koiko ima clanova ekipe
	TezineClanovaEkipe(int kapacitet){
		nizTezina = new double[kapacitet];
		
		for( int i=0; i<nizTezina.length; i++) {
			nizTezina[i]=-1;
		}
	}

	
	
	
	//Napravi metodu unesi koja prima parametar tezinu novog clana i dodaje
	//je u niz tezina na prvo slobodno mesto. Dodavanje se radi samo ako 
	//niz nije popunjen do maksimuma i ako je uneta tezina veca od 40.5 kg
	//Ako je niz popunjen ili ako tezina nije u dozvoljenim granicama, 
	//potrebno ispisati poruku "GRESKA"
	void unesi(double tezina) {
		if(brojac<nizTezina.length && tezina>=40.5) {
			nizTezina[brojac] = tezina;
			brojac++;
		}else
			System.out.println("Greska!");
	}
	
	
	// metodu ispisi koja prikazuje sadrzaja niza na ekranu 
	void ispisi() {
		for(int i=0; i< brojac; i++) { // sto nije <=
			System.out.println(nizTezina[i]);
		}
	}
	
	
	//metodu pronadjiTezinu koja kao parametar prima tezinu nekog boksera
	// i proverava da li se u nizu moze pronaci neki bokser iste te tezine
	//ako moze, onda metoda vraca true, inace false
	
	boolean pronadjiTezinu(double trazenaTezina) {
		for(int i=0; i<brojac; i++) {
			if(trazenaTezina==nizTezina[i]) {//ovde moze nizTezina-inicijalizovan
				                             //je na pocetku
				return true;
			}
		}
		return false;
	}
	
	
	//ispisi metodu pronadjiNajlakseg koja pronalazi tezinu najlakseg boksera
	//i proverava da li se u nizu tezina moze naci bokser iste te tezine
	//ako moze, vraca min; ako ne moze, vraca -1
	double pronadjiNajlakseg() {
     //ako tim ima 0 ljudi:
		if(brojac==0)
		return -1;
	//ako nema 0 ljudi, vrati mi minimum tj najlakseg clana 
    // inicijalizacija kao da je minimum prvi i stalno se poredi sa sledecim
	// kroz celu for petlju
	double min = nizTezina[0];
	for(int i=0; i<brojac; i++) { // 66 77 55 56 44
		if(nizTezina[i]<min) {
			min=nizTezina[i];
		}
	    }
	return min;// ako brojac nije 0, vracas mi minimum, tj, najmanju tezinu
	}
	
	
	
	
	//metodu ispisiKategorije koja ispissuje na ekranu koliko boksera
	//iz ekipe pripada lakoj, srednjoj, teskoj kategoriji. Ako je tezina
	//boksera manja od 65kg, on pripada lakoj kategoriji; ako je tezina boksera 
	//izmedju 65 kg i 85 kg, on pripada srednjoj; ako je tezina veca od 
	// 85 kg, on pripada teskoj kategoriji.
	//ispis: u formatu "Laka: 4", "Srednja:1", "Teska: 9"
	
	
	
	
	/*
	void ispisiKategorije() {
		int suma = 0;
		if(brojac==0) {
			System.out.println("Nema boksera u timu");
		}else{
		for( int i=0; i<brojac; i++) { // i=0; brojac=10; 
			if(nizTezina[i]>65) {
				//kako da znam koliko je puta i proslo?
				suma=suma+1;
				System.out.println("Laka: "  + suma );
			}
			else if(nizTezina[i]>65 && nizTezina[i]<85) {
				suma=suma+1;
				System.out.println("Srednja:" + suma);
			}
			else {
				suma++;
				System.out.println("Teska: " + suma);
			}
		}
	}
	}
	*/
	
	
	 void ispisiKategorije() {
	 int laka=0;
	 int srednja=0;
	 int teska=0;
	 for(int i =0; i<brojac;  i++){
	 if (nizTezina[i]<85)laka++;
	 else if(nizTezina[i]<85)srednja++;
	 else teska++;
	 }
	 System.out.println("Laka: " + laka);
	 System.out.println("Teska: " + teska);
	 System.out.println("Srednja: " + srednja);
	   
	   }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	







}
