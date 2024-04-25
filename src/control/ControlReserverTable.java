package control;

import model.CarnetClientele;
import model.Client;
import model.Formulaire;
import model.FormulaireRestaurant;
import model.Reservation;
import model.ReservationRestaurant;
import model.Restaurant;

public class ControlReserverTable {
	private Restaurant restaurant;
	private FormulaireRestaurant[] formulaires;
	private CarnetClientele carnetClientele;
	

	public ControlReserverTable(Restaurant restaurant,CarnetClientele carnetClientele) {
		this.restaurant = restaurant;
		this.formulaires = new FormulaireRestaurant[100];
		this.carnetClientele = carnetClientele;
	}

	public int[] trouverPossibilite(String jour, String mois, String nbPersonnes, String numService) {
		int intJour = Integer.parseInt(jour);
		int intMois = Integer.parseInt(mois);
		int intNbPersonnes = Integer.parseInt(nbPersonnes);
		int intNumService = Integer.parseInt(numService);
		FormulaireRestaurant formulaire = new FormulaireRestaurant(intJour,intMois,intNbPersonnes,intNumService);
		boolean formulaireEnregistrer = false;
		int numeroFormulaire = -1;
		
		for (int i = 0; i < formulaires.length && !formulaireEnregistrer; i++) {
			if (formulaires[i] == null) {
					formulaires[i] = formulaire;
					formulaireEnregistrer = true;
					numeroFormulaire = i;
			}
		}

		int[] possibilites = restaurant.donnerPossibilites(formulaire);
		int[] retour = new int[possibilites.length + 1];
		retour[0] = numeroFormulaire;
		
		for (int i = 1; i < possibilites.length + 1; i++) {
			retour[i] = possibilites[i - 1];
		}
		
		return retour;
	}

	public void reserver(int numClient, int numProposition, int numeroFormulaire) {
		FormulaireRestaurant formulaireRestaurant = formulaires[numeroFormulaire];
		formulaires[numeroFormulaire] = null;
		Reservation reservation = restaurant.reserver(numProposition, formulaireRestaurant);
		
		if (reservation instanceof ReservationRestaurant) {
			ReservationRestaurant reservationRestaurant = (ReservationRestaurant) reservation;
			Client client = carnetClientele.getClient(numClient);
			client.ajouterReservation(reservationRestaurant);
		}
	}
}
