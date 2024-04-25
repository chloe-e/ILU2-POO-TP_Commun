package test_fonctionnel;

import control.ControlConnecterClient;
import control.ControlCreerClient;
import control.ControlReserverTable;
import frontiere.BoundaryConnecterClient;
import frontiere.BoundaryCreerClient;
import frontiere.BoundaryReserverTable;
import model.CarnetClientele;
import model.Restaurant;

public class TestControlReserverTable {
	public static void main(String[] args) {
		// ENTITES
		CarnetClientele carnetClientele = new CarnetClientele();
		Restaurant restaurant = new Restaurant();
	    // 
				
		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientele);
		BoundaryCreerClient boundaryCreerClient 
			= new BoundaryCreerClient(controlCreerClient);
		boundaryCreerClient.creerClient();
		
		System.out.println("\n---------- CONNECTER CLIENT ----------");
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnetClientele);
		BoundaryConnecterClient boundaryConnecterClient = new BoundaryConnecterClient(controlConnecterClient);
		int numClient = boundaryConnecterClient.connecterClient();
		
		System.out.println("---------- RESERVER TABLE ----------");
		
		restaurant.ajouterTable(2);
		restaurant.ajouterTable(3);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		
		ControlReserverTable controlReserverTable = new ControlReserverTable(restaurant, carnetClientele);
		BoundaryReserverTable boundaryReserverTable = new BoundaryReserverTable(controlReserverTable);
		boundaryReserverTable.reserverTable(numClient);
		
		
		System.out.println("\n\n---------- CONTROLE DES DONNEES ----------");
		System.out.println(carnetClientele);
		System.out.println("Reservation : ");
		System.out.println(carnetClientele.getClient(numClient).getRes());
	}
}
