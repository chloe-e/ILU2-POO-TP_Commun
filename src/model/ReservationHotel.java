package model;

public class ReservationHotel extends Reservation{
	private int nbLitsSimples;
	private int nbLitsDoubles;
	
	public ReservationHotel(int jour, int mois, int numChambre, int nbLitsSimples, int nbLitsDoubles) {
		super(jour, mois, numChambre);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
	}
	
	public String toString() {
		return "Le " + (super.getJour()) + "/" + (super.getMois()) + " : chambre n°" + super.getNumEntite() + " avec " +
				nbLitsSimples + " lits simples et " + nbLitsDoubles + " lits doubles.";
	}
}
