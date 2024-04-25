package model;

public class Client {
	private String nom;
	private String prenom;
	private String adresseMail;
	private String mdp;

//	A décommenter pour la question6
	private Reservation[] reservations = new Reservation[100]; 
	private int nbReservation = 0;

	public Client(String nom, String prenom, String adresseMail, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.mdp = mdp;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public boolean connecterClient(String mdp) {
		return mdp.equals(this.mdp);
	}

	public void ajouterReservation(Reservation reservation) {
		this.reservations[nbReservation] = reservation;
		nbReservation++;
	}
	
	// UNIQUEMENT POUR VERIFICATION
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("nom=" + nom + ", prenom=" + prenom);
		chaine.append(", adresseMail=" + adresseMail + ", mdp=" + mdp);
		return chaine.toString();
	}
	public String getRes() {
		return reservations[0].toString();
	}
}