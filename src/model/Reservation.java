package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	private int numEntite;
	
	protected Reservation(int jour, int mois, int numEntite) {
		this.jour = jour;
		this.mois = mois;
		this.numEntite = numEntite;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
	public int getNumEntite() {
		return numEntite;
	}
	
	
}
