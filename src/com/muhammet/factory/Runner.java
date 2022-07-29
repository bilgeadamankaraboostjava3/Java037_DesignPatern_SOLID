package com.muhammet.factory;

public class Runner {

	public static void main(String[] args) {
	
		/**
		 * Factory Design Patern,
		 * 
		 */
		
		//Tasima tasima = new Gemi();
		//tasima = new Kamyon();
		/**
		 *  1- TasimaTipi
		 *  2- Tasima
		 *  3- Gemi,Kamyon,Kamyonet
		 *  4- TasimaFactory
		 *  5- Runner
		 *  
		 */
		
		
		Tasima tasima;
		tasima = TasimaFactory.builder(TasimaTipi.KARA);
		tasima = TasimaFactory.builder(TasimaTipi.DENIZ);
		
	}//
}//
