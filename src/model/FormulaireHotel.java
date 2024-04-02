package model;

public class FormulaireHotel extends Formulaire{
	private int nbLitsSimples;
	private int nbLitsDoubles;
	
	public FormulaireHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles) {
		super(jour, mois);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
	}

	public int getNbLitsSimples() {
		return nbLitsSimples;
	}

	public int getNbLitsDoubles() {
		return nbLitsDoubles;
	}
}
