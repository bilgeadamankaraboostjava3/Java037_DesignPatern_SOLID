package com.muhammet.singleton;

public class RunnerSingleton {

	public static void main(String[] args) {
		
	//	UrunSingleton urun = new UrunSingleton();
		UrunSingleton urun = UrunSingleton.getInstance();
		urun.setAd("�eker");
		// -> db ye ba�lan
		// -> datay� kaydet
		// -> baplant� kapat
		// db.save();
		UrunSingleton urun1 = UrunSingleton.getInstance();
		urun.setAd("Un");
		//db.save();
		
		System.out.println(urun);
		System.out.println(urun1);
		
		
		
		
	}

}
