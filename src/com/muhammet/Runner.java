package com.muhammet;

public class Runner {

	public static void main(String[] args) {

		/**
		 * Design Patern - Tasar�m Kal�plar� & �r�nt�leri
		 * --- Sinbgleton Design Patern,
		 * ----- new Satis(); -> +1, +2, +3, ....... 
		 * ----- yeni yarat�lan ger bir nesne heap alan�nda yer kaplar. uygulma
		 * kapat�l�ncaya kadar orada kalabilir. Bellek dolabilir.
		 * ----- i�iniz biten nesneyi i�aret eden de�i�keni null ile de�i�tirirseniz.
		 * ----- adreslenmeyen nesne GC(Garbage Collectors - ��p Toplay�c�lar� ) 
		 * taraf�ndan bellekten silinir.
		 * -----------
		 * ----------- DB ye �r�n kay�t etme i�lemleri yap�yoruz diyelim.
		 * Urun urun = new Urun(0001,�eker,15); // 0X541
		 * Db.save(urun);
		 * Urun urun = new Urun(004,Un,43);// 0X343
		 * Db.save(urun);
		 * ----------------
		 * Urun.nesneVer(); // 0X451 (Urun)
		 * Urun urun = URun.nesneVer(006,�ay,32); //0X451
		 * urun = Urun.nesneVer(001,�eker,56); // 0X451
		 * 
		 */


	}

}
