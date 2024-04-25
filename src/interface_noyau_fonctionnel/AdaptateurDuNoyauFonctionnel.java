package interface_noyau_fonctionnel;

import control.ControlReserverTable;
import control.ControlVisualiserCarnetClientele;

public class AdaptateurDuNoyauFonctionnel {
	
	private ControlReserverTable control;
	private ControlVisualiserCarnetClientele controlVisualiserCarnetClientele;
	private int[] propositions;
	
	public AdaptateurDuNoyauFonctionnel(ControlReserverTable control,
			ControlVisualiserCarnetClientele controlVisualiserCarnetClientele) {
		this.control = control;
		this.controlVisualiserCarnetClientele = controlVisualiserCarnetClientele;
	}
	
	public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
		int numService;
		if (time.equals("19H30")) {
			numService = 1;
		} else {
			numService = 2;
		}
		
		propositions = control.trouverPossibilite(Integer.toString(jour), Integer.toString(mois), Integer.toString(nombrePersonnes), Integer.toString(numService));
		int nbProposition = 0;
		int[] propositionRetenue = new int[propositions.length - 1];
		for (int i = 1; i < propositions.length; i++) {
			if (propositions[i] != 0) {
				propositionRetenue[nbProposition] = propositions[i];
				nbProposition++;
			}
		}
		String[] propString;
		propString = new String[nbProposition];
		for (int i = 0; i < nbProposition; i++) {
			propString[i] = "" + propositionRetenue[i];
		}
		
		return propString;
	}
	
	public int selectionTable(int numIndice) {
		return propositions[numIndice];
	}
	
	public String reserverTable(int numClient, int numTable/*, int[] proposition*/) {
		control.reserver(numClient, numTable, propositions[0]);
		return controlVisualiserCarnetClientele.visualiserCarnetClientel();
	}

}
