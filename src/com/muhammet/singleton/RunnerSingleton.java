package com.muhammet.singleton;

public class RunnerSingleton {

	public static void main(String[] args) {
		
	//	UrunSingleton urun = new UrunSingleton();
		UrunSingleton urun = UrunSingleton.getInstance();
		urun.setAd("Þeker");
		// -> db ye baðlan
		// -> datayý kaydet
		// -> baplantý kapat
		// db.save();
		UrunSingleton urun1 = UrunSingleton.getInstance();
		urun.setAd("Un");
		//db.save();
		
		System.out.println(urun);
		System.out.println(urun1);
		
		
		
		
	}

}
