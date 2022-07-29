package com.muhammet.factory;

public class Gemi extends Tasima{

	public Gemi() {
		super(TasimaTipi.DENIZ);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Gemi Ýþe Baþladý.");
		
	}

}
