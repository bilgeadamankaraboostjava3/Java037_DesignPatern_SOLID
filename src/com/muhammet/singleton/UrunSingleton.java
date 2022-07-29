package com.muhammet.singleton;

public class UrunSingleton {

	/**
	 * LazyLoad ->
	 */
	/**
	 * Dýþarýdn eriþilemeyen 
	 * static adresi deðiþmeyen
	 * ilk deðeri null olan 
	 * bir sýnýf deðiþkeni tanýmladým.
	 */
	private static UrunSingleton instance= null;
	
	private String id;
	private String ad;
	private Double fiyat;
	/**
	 * Access Modifier -> Eriþim Belirteci
	 * method, sýnýf, deðiþken v.s. kavramlara eriþimi kýsýtlar
	 * 1. Adým nesne türetilmemesi için Default Constructor eriþme kapattýk 
	 */
	private UrunSingleton() {
		
	}
	/**
	 * Nesne yaratmanýný temel amacý -> adreslenmesi ve bellekte yer edinmesi.
	 * static -> static keyword ile iþaretlenen bileþenlerin tümü uygulama ayaða
	 * kalkarken adreslenirler. bu nedenle sýnýf için eriþilebilir.
	 * 
	 */
	public static UrunSingleton getInstance() {
		/**
		 * Eðer birisi bu method u çaðýrýr ise,
		 * deðiþken null, yani bir adres ile nesne referans ediyor mu?
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
