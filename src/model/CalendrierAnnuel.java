package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		this.calendrier = new Mois[12];
		String[] nomMois = {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
		int[] joursMois = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < 12; i++) {
			calendrier[i] = new Mois(nomMois[i],joursMois[i]);
		}
	}
	
	public boolean estLibre(int jour,int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		try {
			calendrier[mois-1].reserver(jour);
		}
		catch (IllegalStateException e) {
			return false;
		}
		return true;
		
	}
	
	private static class Mois {
		private String nom;
		private boolean jours[];
		
		public Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}
		
		public boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		
		public void reserver(int jour) throws IllegalStateException {
			if(!estLibre(jour)) {
				throw new IllegalStateException();
			}
			jours[jour-1] = true;
		}
	}
}
