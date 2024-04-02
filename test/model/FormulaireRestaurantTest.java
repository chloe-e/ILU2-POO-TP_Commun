package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FormulaireRestaurantTest {
	static FormulaireRestaurant formulaire;
	static final int NB_PERSONNES = 3;
	static final int NUM_SERVICE = 2;
	static final int JOUR = 10;
	static final int MOIS = 12;
	static final int IDENTIFICATION_1 = 0;
	static final int IDENTIFICATION_2 = 2;

	@BeforeAll
	static void setUpBeforeClass() {
		formulaire = new FormulaireRestaurant(JOUR, MOIS, NB_PERSONNES, NUM_SERVICE);
	}

	@Test
	void testFormulaireRestaurant() {
		assertNotNull(formulaire, "formulaire null");
	}

	@Test
	void testgetNbPersonnes() {
		assertEquals(NB_PERSONNES, formulaire.getNbPersonnes(),
				"Le nombre de personnes devrait être " + NB_PERSONNES);
	}

	@Test
	void testGetNumService() {
		assertEquals(NUM_SERVICE, formulaire.getNumService(), "Le numéro de service devrait être " + NUM_SERVICE);
	}

	@Test
	void getJour() {
		assertEquals(JOUR, formulaire.getJour(), "Le jour devrait être " + JOUR);
	}

	@Test
	void getMois() {
		assertEquals(MOIS, formulaire.getMois(), "Le mois devrait être " + MOIS);
	}

	@Test
	void setNumEntiteReservee() {
		FormulaireRestaurant formulaire2 = new FormulaireRestaurant(JOUR, MOIS, NB_PERSONNES, NUM_SERVICE);
		assertEquals(IDENTIFICATION_1, formulaire2.getNumEntiteReservee(),
				"L'identification du formulaire devrait être " + IDENTIFICATION_1);
		formulaire2.setNumEntiteReservee(IDENTIFICATION_2);
		assertEquals(IDENTIFICATION_2, formulaire2.getNumEntiteReservee(),
				"L'identification du formulaire devrait être " + IDENTIFICATION_2);
	}

	@Test
	void getNumEntiteReservee() {
		assertEquals(IDENTIFICATION_1, formulaire.getNumEntiteReservee(),
				"L'identification du formulaire devrait être " + IDENTIFICATION_1);
	}

}
