package com.muhammet;

public class Runner {

	public static void main(String[] args) {

		/**
		 * Design Patern - Tasarým Kalýplarý & Örüntüleri
		 * --- Sinbgleton Design Patern,
		 * ----- new Satis(); -> +1, +2, +3, ....... 
		 * ----- yeni yaratýlan ger bir nesne heap alanýnda yer kaplar. uygulma
		 * kapatýlýncaya kadar orada kalabilir. Bellek dolabilir.
		 * ----- iþiniz biten nesneyi iþaret eden deðiþkeni null ile deðiþtirirseniz.
		 * ----- adreslenmeyen nesne GC(Garbage Collectors - Çöp Toplayýcýlarý ) 
		 * tarafýndan bellekten silinir.
		 * -----------
		 * ----------- DB ye ürün kayýt etme iþlemleri yapýyoruz diyelim.
		 * Urun urun = new Urun(0001,Þeker,15); // 0X541
		 * Db.save(urun);
		 * Urun urun = new Urun(004,Un,43);// 0X343
		 * Db.save(urun);
		 * ----------------
		 * Urun.nesneVer(); // 0X451 (Urun)
		 * Urun urun = URun.nesneVer(006,Çay,32); //0X451
		 * urun = Urun.nesneVer(001,Þeker,56); // 0X451
		 * 
		 */


	}

}
