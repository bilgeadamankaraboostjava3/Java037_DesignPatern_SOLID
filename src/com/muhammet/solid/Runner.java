package com.muhammet.solid;

public class Runner {

	public static void main(String[] args) {
	
		/**
		 * SOLID - 
		 * Amac�;
		 * 1- Yaz�l�m�n esnek ve yeniden kullan�labilir olmas�n� sa�lamak.
		 * 2- Kodlar�n anla��l�r olmas�n� sa�lar ve okunabilirli�i artt�r�r.
		 * 3- Kodlar�n gereksiz tekrarr�n� �nler.
		 * 4- E�er kodlar�n�z solid e uygun yazmaya �al���rsan�z, kodlar� tekrar
		 * d�zenlemek i�lemlerinden tasarruf etmi� olursunuz.
		 * 
		 * S - Single responsbility, 
		 * Method, Class, Interface -> bir method sadece bir i� yapmal�,
		 * save();  // MusteriRepository.class // findAll(); findByName(Srtring name);
		 * 
		 * O - Open-closed 
		 * Bir s�n�f ya da method de�i�ime kapal� ama geli�ime a��k olmal�d�r.
		 * 
		 * 
		 * L - Liskov substitution 
		 * GEreksiz methodlardan uzak durmal�s�n�z ve ortak kullan�mlar�n mirasla,
		 * ek kullan�mlar� interface implament ederek kullanmak daha esnek bir tyap� sa�lar.
		 * 
		 * I- Interface Segregation
		 * Uygulama i�inde tan�mlanacak olana sorunluluklar� tek bir ara y�z �zerinde 
		 * toplamaml�s�n�z.
		 * ICRUD -> musteriSave(); UrunSave(); ....
		 * IMusteriRepository, ICreate, IUpdate, 
		 * 
		 * D- Dependency Inversion
		 * S�n�flar� aras�ndaki ba��ml�l�klar�n�z olabildi�ince aza indirmeniz gereklidir.
		 * �deme Y�ntemi -> KrediKart�, �ek, DijitalPara, 
		 * 
		 * KrediKart� kk = new KrediKart�();
		 * odemeyap(kk) {
		 * 
		 * }
		 * 
		 * IOdemeYontemi -> KrediKart�(implements IOdemeYontemi), Cek(implements IOdemeYontemi)
		 *                 KriptoPara(implements IOdemeYontemi)
		 * odemeyap(IOdemeYontemi){
		 * }
		 * 
		 * 
		 */

	}//
}//
