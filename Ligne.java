package SibraProj;

import java.util.ArrayList;

public class Ligne{
	//Liste qui comprend les noms des arrets de la ligne et les temps que prend le bus pour atteindre l'arret suivant correspondant a l'arret
	private int numLigne;
	protected String sens1;
	protected String sens2;
	protected ArrayList<Arret> arrets = new ArrayList<Arret>();
	private ArrayList<String> horaires = new ArrayList<>();
	protected int[][]h2 = new int[1000][];
	private int cpt = 0;
	private int i2 = 0;


	
	public Ligne(int numLigne, ArrayList<Arret> arrets, ArrayList<String> horaires) {
		this.arrets=arrets;
		this.numLigne=numLigne;
		this.horaires=horaires;
	}		
	
	public int getNumLigne() {
		return numLigne;
	}
	
	public ArrayList<Arret> getArrets() {
		return arrets;
	}
	
	public ArrayList<String> getHoraires() {
		return horaires;
	}
	
	//On defini les deux sens de la ligne avec les noms des terminus
	public void defSens() {
		sens1 = arrets.get(arrets.size()-1).nomArret;
		sens2 = arrets.get(0).nomArret;
	}
	
	
	//On cree une liste d'horaires qui peut les recuperer dans une chaine de caractere pour les changer chacuns en int
	public int remplirListe() {

	for (int j = 0; j<horaires.size()-1; j++) {
		int[] h1 = new int[1000];
		for (int i = 0; i<horaires.get(j).length()+1; i++) {
			if (((String)horaires.get(j).subSequence(i, i+1)).equals(":")) {
				h1[i] += Integer.parseInt((String) horaires.get(j).subSequence(cpt, i));
				i2 = i;
				cpt = i + 1;
			}
			if (((String)horaires.get(j).subSequence(i, i+1)).equals(" ")){
				h1[i2] += Integer.parseInt((String)horaires.get(j).subSequence(cpt, i));
				cpt = i+1;
			}
			if (((String)horaires.get(j).subSequence(i, i+1)).contentEquals(".")) {
				break;
			}
		}
	}
	return -1;
}
}
