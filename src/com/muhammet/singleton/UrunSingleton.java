package com.muhammet.singleton;

public class UrunSingleton {

	/**
	 * LazyLoad ->
	 */
	/**
	 * D��ar�dn eri�ilemeyen 
	 * static adresi de�i�meyen
	 * ilk de�eri null olan 
	 * bir s�n�f de�i�keni tan�mlad�m.
	 */
	private static UrunSingleton instance= null;
	
	private String id;
	private String ad;
	private Double fiyat;
	/**
	 * Access Modifier -> Eri�im Belirteci
	 * method, s�n�f, de�i�ken v.s. kavramlara eri�imi k�s�tlar
	 * 1. Ad�m nesne t�retilmemesi i�in Default Constructor eri�me kapatt�k 
	 */
	private UrunSingleton() {
		
	}
	/**
	 * Nesne yaratman�n� temel amac� -> adreslenmesi ve bellekte yer edinmesi.
	 * static -> static keyword ile i�aretlenen bile�enlerin t�m� uygulama aya�a
	 * kalkarken adreslenirler. bu nedenle s�n�f i�in eri�ilebilir.
	 * 
	 */
	public static UrunSingleton getInstance() {
		/**
		 * E�er birisi bu method u �a��r�r ise,
		 * de�i�ken null, yani bir adres ile nesne referans ediyor mu?
		 * 
		 */
		if(instance==null) 
			instance = new UrunSingleton();			
		
		return instance;	
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public Double getFiyat() {
		return fiyat;
	}
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
	
}
