package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int nbTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int nbTable) {
		super(jour, mois);
		this.numService = numService;
		this.nbTable = nbTable;
	}

	public String toString() {
		return "Le " + (super.getJour()) + "/" + (super.getMois()) + " : table n°" + nbTable + 
				" pour le " + ((numService == 1)?"premier":"deuxième") + " service.";
	}
}
