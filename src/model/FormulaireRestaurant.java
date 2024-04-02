package model;

public class FormulaireRestaurant extends Formulaire {
	private int nbPersonnes;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois);
		this.nbPersonnes = nbPersonnes;
		this.numService = numService;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public int getNumService() {
		return numService;
	}
}
