package model;

public class CentraleReservation <T extends Formulaire> {
	private EntiteReservable[] entites;
	private int nbEntites;
	
	public CentraleReservation(EntiteReservable[] entites, int nbEntites) {
		this.entites = entites;
		this.nbEntites = nbEntites;
	}
	
	public int ajouterEntite(EntiteReservable entite) {
		entites[nbEntites] = entite;
		nbEntites+=1;
		return nbEntites;
	}
	
	public int[] donnerPossibilites(T form) {
		int[] possibilites = null;
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
	
	public reserver(int numEntite, T form) {
		
	}
}
