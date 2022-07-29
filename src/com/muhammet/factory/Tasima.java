package com.muhammet.factory;

public abstract class Tasima {

	private TasimaTipi tip=null;
	
	public Tasima(TasimaTipi tip) {
		this.tip = tip;
		araislem();
	}
	
	private void araislem() {
		// nesne olu�turma s�ras�nda yapmak istedi�iniz i�lemler var ise 
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
