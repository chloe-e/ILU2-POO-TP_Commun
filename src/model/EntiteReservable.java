package model;

public class EntiteReservable <T extends Formulaire> {
	private CalendrierAnnuel calendrier;
	private int numId;
	
	public EntiteReservable(int numId) {
		this.calendrier = new CalendrierAnnuel();
		this.numId = numId;
	}
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	
	public boolean estLibre(T formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public boolean compatible(T formulaire) {
		return estLibre(formulaire);
	}
	
	public Reservation reserver(T formulaire) {
		if(compatible(formulaire)) {
			calendrier.reserver(formulaire.getJour(), formulaire.getMois());
		}
		return null;
	}
}
