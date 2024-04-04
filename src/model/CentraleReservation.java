package model;

public class CentraleReservation <T extends Formulaire> {
	private EntiteReservable<T>[] entites;
	private int nbEntites;
	
	public CentraleReservation(EntiteReservable<T>[] entites, int nbEntites) {
		this.entites = entites;
		this.nbEntites = nbEntites;
	}
	
	public int getNbEntites() {
		return nbEntites;
	}
	public int ajouterEntite(EntiteReservable<T> entite) {
		entites[nbEntites] = entite;
		nbEntites+=1;
		return nbEntites;
	}
	
	public int[] donnerPossibilites(T form) {
		int[] possibilites = new int[nbEntites];
		for (int i = 0; i < nbEntites; i++) {
			if(entites[i].compatible(form)) {
				possibilites[i] = entites[i].getNumId();
			}
			else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
	public Reservation reserver(int numEntite, T form) {
		form.setNumEntiteReservee(entites[numEntite].getNumId());
		return entites[numEntite].reserver(form);
	}
}
