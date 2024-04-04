package model;

public class Restaurant  {
	CentraleReservation<FormulaireRestaurant> centrale;

	public Restaurant() {
		super();
		Table[] entites = new Table[100];
		this.centrale = new CentraleReservation<> (entites, 0);
	}
	
	public void ajouterTable(int nbChaises) {
		Table table = new Table((centrale.getNbEntites()+1), nbChaises);
		centrale.ajouterEntite(table);
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant form) {
		return centrale.donnerPossibilites(form);
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant form) {
		return centrale.reserver(numEntite, form);
	}
	
	public static class Table extends EntiteReservable<FormulaireRestaurant>{
		private int nbChaises;
		CalendrierAnnuel calendrierDeuxiemeService;
		
		public Table(int numId, int nbChaises) {
			super(numId);
			this.nbChaises = nbChaises;
			this.calendrierDeuxiemeService = new CalendrierAnnuel();
		}
			
		@Override
		public boolean compatible(FormulaireRestaurant form) {
			boolean ret = form.getNbPersonnes() == nbChaises || form.getNbPersonnes() == nbChaises-1;
			if(form.getNumService() == 1) {
				ret = ret && super.estLibre(form);
			}
			else {
				ret = ret && calendrierDeuxiemeService.estLibre(form.getJour(), form.getMois());
			}
			return ret;
		}
			
		@Override
		public Reservation reserver(FormulaireRestaurant form){
			if(form.getNumService() == 1) {
				super.reserver(form);
			}
			else {
				calendrierDeuxiemeService.reserver(form.getJour(), form.getMois());
			}
			return new ReservationRestaurant(form.getJour(),form.getMois(),form.getNumService(),form.getNbPersonnes());
			
		}
		
	}
	
}
