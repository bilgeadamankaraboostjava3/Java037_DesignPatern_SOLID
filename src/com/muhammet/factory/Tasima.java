package com.muhammet.factory;

public abstract class Tasima {

	private TasimaTipi tip=null;
	
	public Tasima(TasimaTipi tip) {
		this.tip = tip;
		araislem();
	}
	
	private void araislem() {
		// nesne oluþturma sýrasýnda yapmak istediðiniz iþlemler var ise 
		//burada toplarlanabilir.
	}
	
	protected abstract void construct();

	public TasimaTipi getTip() {
		return tip;
	}

	public void setTip(TasimaTipi tip) {
		this.tip = tip;
	}
	
	
}
