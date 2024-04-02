package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int numEntiteReservee;
	
	public Formulaire(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public void setNumEntiteReservee(int numEntiteReservee) {
		this.numEntiteReservee = numEntiteReservee;
	}

	public int getNumEntiteReservee() {
		return numEntiteReservee;
	}
}
