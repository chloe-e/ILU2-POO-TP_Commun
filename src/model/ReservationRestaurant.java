package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	
	public ReservationRestaurant(int jour, int mois, int numService, int nbTable) {
		super(jour, mois, nbTable);
		this.numService = numService;
	}

	public String toString() {
		return "Le " + (super.getJour()) + "/" + (super.getMois()) + "\nTable " + super.getNumEntite() + 
				" pour le " + ((numService == 1)?"premier":"deuxième") + " service.";
	}
}
