package com.muhammet.solid;

public class Runner {

	public static void main(String[] args) {
	
		/**
		 * SOLID - 
		 * Amacý;
		 * 1- Yazýlýmýn esnek ve yeniden kullanýlabilir olmasýný saðlamak.
		 * 2- Kodlarýn anlaþýlýr olmasýný saðlar ve okunabilirliði arttýrýr.
		 * 3- Kodlarýn gereksiz tekrarrýný önler.
		 * 4- Eðer kodlarýnýz solid e uygun yazmaya çalýþýrsanýz, kodlarý tekrar
		 * düzenlemek iþlemlerinden tasarruf etmiþ olursunuz.
		 * 
		 * S - Single responsbility, 
		 * Method, Class, Interface -> bir method sadece bir iþ yapmalý,
		 * save();  // MusteriRepository.class // findAll(); findByName(Srtring name);
		 * 
		 * O - Open-closed 
		 * Bir sýnýf ya da method deðiþime kapalý ama geliþime açýk olmalýdýr.
		 * 
		 * 
		 * L - Liskov substitution 
		 * GEreksiz methodlardan uzak durmalýsýnýz ve ortak kullanýmlarýn mirasla,
		 * ek kullanýmlarý interface implament ederek kullanmak daha esnek bir tyapý saðlar.
		 * 
		 * I- Interface Segregation
		 * Uygulama içinde tanýmlanacak olana sorunluluklarý tek bir ara yüz üzerinde 
		 * toplamamlýsýnýz.
		 * ICRUD -> musteriSave(); UrunSave(); ....
		 * IMusteriRepository, ICreate, IUpdate, 
		 * 
		 * D- Dependency Inversion
		 * Sýnýflarý arasýndaki baðýmlýlýklarýnýz olabildiðince aza indirmeniz gereklidir.
		 * Ödeme Yöntemi -> KrediKartý, Çek, DijitalPara, 
		 * 
		 * KrediKartý kk = new KrediKartý();
		 * odemeyap(kk) {
		 * 
		 * }
		 * 
		 * IOdemeYontemi -> KrediKartý(implements IOdemeYontemi), Cek(implements IOdemeYontemi)
		 *                 KriptoPara(implements IOdemeYontemi)
		 * odemeyap(IOdemeYontemi){
		 * }
		 * 
		 * 
		 */

	}//
}//
