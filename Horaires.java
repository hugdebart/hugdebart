package SibraProj;

import java.util.ArrayList;

public class Horaires{
	private String heure;
	protected ArrayList<String> heures = new ArrayList <String>();
	private String jour;
	private String mois;
	private String type = "Jour Normal";
	
	public Horaires(String heure) {
		this.heure=heure;
	}
	
	
	public String getHeures() {
		return heure;
	}
	
	
}
	//Cette methode sert a traiter les jours feries et autres jours ou les horaires de bus sont differents
	/*public void aHoraireDiff() {
		if (mois == "novembre" && dateJour == 11) {
			this.type = "Férie";			
		}
		if (mois == "decembre" && dateJour == 25) {
			this.type = "Férié";
		}
		if (mois == "janvier" && dateJour == 1) {
			this.type = "Férié";
		}
		if (mois == "aout" || mois == "juillet") {
			this.type = "Vacances";
		}
		if (jour == "samedi") {			
			this.type = "Samedi";
		}
	}*/

