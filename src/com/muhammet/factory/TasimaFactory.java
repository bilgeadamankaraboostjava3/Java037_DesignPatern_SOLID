package com.muhammet.factory;

public class TasimaFactory {

	public static Tasima builder(TasimaTipi tip) {
		switch (tip) {
		case KARA: return new Kamyonet();
		case DENIZ: return new Gemi();
		default: return new Kamyon();
		}
	}
}

/*
 * 
 * application.properties
 * application.yml
 * 
 * 	tasima:
 * 		tipi: 
 * 		  KARA: kamyonet
 *        DENIZ: gemi
 *        HAVA: ucak
 * 
 * 
 * */
