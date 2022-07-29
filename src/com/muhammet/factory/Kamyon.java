package com.muhammet.factory;

public class Kamyon extends Tasima{

	public Kamyon() {
		super(TasimaTipi.KARA);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Kamnyon Ýþe Baþladý");
		
	}

	
}
