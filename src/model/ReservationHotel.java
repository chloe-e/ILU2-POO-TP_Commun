package model;

public class ReservationHotel extends Reservation{
	private int numChambre;
	private int nbLitsSimples;
	private int nbLitsDoubles;
	
	public ReservationHotel(int jour, int mois, int numChambre, int nbLitsSimples, int nbLitsDoubles) {
		super(jour, mois);
		this.numChambre = numChambre;
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
	}
	
	public String toString() {
		return "Le " + (super.getJour()) + "/" + (super.getMois()) + " : chambre n°" + numChambre + " avec " +
				nbLitsSimples + " lits simples et " + nbLitsDoubles + " lits doubles.";
	}
}
