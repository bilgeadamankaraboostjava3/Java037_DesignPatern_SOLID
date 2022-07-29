package com.muhammet.factory;

public class Kamyonet extends Tasima{

	public Kamyonet() {
		super(TasimaTipi.KARA);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Kamyonet i�e ba�lad�");
	}

}
