package com.muhammet.singleton;

public class UrunSingletonEager {
	private String id;
	private String ad;
	private Double fiyat;
	private static UrunSingletonEager instance = new UrunSingletonEager();
	private UrunSingletonEager() {
		
	}
	
	public static UrunSingletonEager getInstance() {
		return instance;
	}
}
