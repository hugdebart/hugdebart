package SibraProj;

import java.util.ArrayList;

import in.keyboard.Keyboard;

public class main {
	public static void main(String[] args) {
		
		// On crée chaque arret de la ligne 1
		Arret parcDesGlaisins = new Arret("Parc des Glaisins");
		Arret vernod = new Arret("Vernod");
		Arret poisyCollege = new Arret("Poisy Collège");
		Arret lyceePoisy = new Arret("Lycée de Poisy");
		Arret meythetLeRabelais = new Arret("Meythet Le Rabelais");
		Arret chorus = new Arret("Chorus");
		Arret mandallaz = new Arret("Mandallaz");
		Arret gare = new Arret("Gare");
		Arret franceBarattes = new Arret("France Barattes");
		Arret cesBarattes = new Arret("CES Barattes");
		Arret palaisDeJustice = new Arret("Palais de justice");
		Arret vignieres = new Arret("Vignières");
		Arret ponchy = new Arret("Ponchy");
		Arret piscinePatinoire = new Arret("Piscine-Patinoire");
		Arret arcadium = new Arret("Arcadium");
		Arret parcDesSports = new Arret("Parc des sports");
		Arret placeDesRomains = new Arret("Place des Romains");
		Arret courier = new Arret("Courier");
		Arret bonlieu = new Arret("Bonlieu");
		Arret prefecturePaquier = new Arret("Préfecture-Paquier");
		Arret imperial = new Arret("Impérial");
		Arret pommaries = new Arret("Pommaries");
		Arret campus = new Arret("Campus");
		
		// On recupere les horaires habituels de passage de chaque arret sur la ligne 1
		// Et on les stocke dans des listes
		Horaires horairePoisyCollegeL1S1 = new Horaires("5:53 6:11 6:27: 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 12:59 13:12 13:20 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 17:25 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41: 19:57");
		ArrayList horairePoisyCollegeL1S1List = new ArrayList() {{add(horairePoisyCollegeL1S1.getHeures());}};
		Horaires horaireVernodL1S1 = new Horaires("5:56 6:14 6:31 6:48 6:58 7:08 7:15 7:20 7:25 7:32 7:40 7:49 7:58 8:08 8:20 8:31 8:42 8:54 9:05 9:18 9:31 9:46 10:01 10:16 10:31 10:46 11:00 11:14 11:28 11:42 11:57 12:08 12:21 12:35 12:48 13:03 13:16 13:24 13:32 13:43 13:56 14:10 14:24 14:38 14:50 15:03 15:16 15:30 15:44 15:57 16:11 16:21 16:34 16:45 16:57 17:07 17:17 17.29: 17:40 17:48 17:58 18:11 18:24 18:39 18:55 19:10 19:27 19:44 20.00");
		ArrayList horaireVernodL1S1List = new ArrayList() {{add(horaireVernodL1S1.getHeures());}};
		Horaires horaireMeythetLeRabelaisL1S1 = new Horaires("6:01 6:19 6:36 6:53 7:03 7:13 7:21 7:26 7:31 7:38 7:46 7:55 8:04 8:14 8:25 8:36 8:47 8:59 9:10 9:23 9:36 9:51 10:06 10:21 10:36 10:51 11:05 11:19 11:33 11:47 12:02 12:13 12:26 12:40 12:53 13:08 13:21 13:29 13:37 13:48 14:01 14:15 14:29 14:43 14:55 15:08 15:22 15:36 15:49 16:02 16:16 16:27 16:40 16:51 17:03 17:12 17:23 17:34 17:45 17:53 18:03 18:16 18:29 18:44 19:00 19:15 19:32 19:49 20:05.");
		ArrayList horaireMeythetLeRabelaisL1S1List = new ArrayList() {{add(horaireMeythetLeRabelaisL1S1.getHeures());}};
		Horaires horaireChorusL1S1 = new Horaires("6:07 6:25 6:42 6:59 7:09 7:19 7:27 7:33 7:38 7:45 7:53 8:03 8:13 8:23 8:33 8:44 8:55 9:06 9:17 9:30 9:43 9:57 10:12 10:27 10:42 10:57 11:11 11:25 11:39 11:53 12:08 12:19 12:32 12:46 12:59 13:14 13:27 13:35 13:43 13:54 14:07 14:21 14:35 14:49 15:01 15:14 15:28 15:42 15:56 16:09 16:23 16:34 16:47 16:58 17:10 17:21 17:32 17:43 17:54 18:02 18:12 18:23 18:35 18:50 19:06 19:21 19:37 19:54 20:10.");
		ArrayList horaireChorusL1S1List = new ArrayList() {{add(horaireChorusL1S1.getHeures());}};
		Horaires horaireMandallazL1S1 = new Horaires("5:53 6:11 6:27 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 12:59 13:12 13:20 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 17:25 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41 19:57.");
		ArrayList horaireMandallazL1S1List = new ArrayList() {{add(horaireMandallazL1S1.getHeures());}};
		Horaires horaireGareL1S1 = new Horaires("5:53 6:11 6:27 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 12:59 13:12 13:20 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 17:25 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41 19:57.");
		ArrayList horaireGareL1S1List = new ArrayList() {{add(horaireGareL1S1.getHeures());}};
		Horaires horaireFranceBarattesL1S1 = new Horaires("5:53 6:11 6:27 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 12:59 13:12 13:20 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 17:25 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41 19:57.");
		ArrayList horairefranceBarattesL1S1List = new ArrayList() {{add(horaireFranceBarattesL1S1.getHeures());}};
		Horaires horaireCesBarattesL1S1 = new Horaires("5:53 6:11 6:27 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 12:59 13:12 13:20 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 17:25 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41 19:57.");
		ArrayList horaireCesBarattesL1S1List = new ArrayList() {{add(horaireCesBarattesL1S1.getHeures());}};
		Horaires horaireVignieresL1S1 = new Horaires("5:53 6:11 6:27 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 12:59 13:12 13:20 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 17:25 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41 19:57.");
		ArrayList horaireVignieresL1S1List = new ArrayList() {{add(horaireVignieresL1S1.getHeures());}};
		Horaires horairePonchyL1S1 = new Horaires("5:53 6:11 6:27 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 12:59 13:12 13:20 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 17:25 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41 19:57.");
		ArrayList horairePonchyL1List = new ArrayList();
		horairePonchyL1List.add(horairePonchyL1S1.getHeures());
		Horaires horaireParcDesGlaisinsL1S1 = new Horaires("5:53 6:11 6:27 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 12:59 13:12 13:20 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 17:25 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41 19:57");
		ArrayList horaireParcDesGlaisinsL1S1List = new ArrayList() {{add(horaireParcDesGlaisinsL1S1.getHeures());}};
		
		//On stocke chaque liste d'horaire dans un grande liste contenant tous les horaires de toute la ligne
		ArrayList <String> listeHoraires = new ArrayList(){{
			add((String) horairePoisyCollegeL1S1List.get(0));
			add((String) horaireVernodL1S1List.get(0));
			add((String) horaireMeythetLeRabelaisL1S1List.get(0));
			add((String) horaireChorusL1S1List.get(0)); 
			add((String) horaireMandallazL1S1List.get(0));
			add((String) horaireGareL1S1List.get(0));
			add((String) horairefranceBarattesL1S1List.get(0));
			add((String) horaireCesBarattesL1S1List.get(0));
			add((String) horaireVignieresL1S1List.get(0)); 
			add((String) horairePonchyL1List.get(0)); 
			add((String) horaireParcDesGlaisinsL1S1List.get(0));
			}};
			
		// On cree une liste d'arrets
		ArrayList <Arret> listeArrets = new ArrayList() {{add(poisyCollege); add(vernod); add(meythetLeRabelais); add(chorus); add(mandallaz); add(gare); add(franceBarattes); add(cesBarattes); add(vignieres); add(ponchy); add(parcDesGlaisins);}};
		//On cree la ligne 1 a partir des donnees rassemblees precedemment
		Ligne ligne1 = new Ligne(1, listeArrets, listeHoraires);
		//On defini les 2 sens de la ligne
		ligne1.defSens();
		//On met les arrets en int dans une liste pour qu'ils soient exploitables
		ligne1.remplirListe();
		
		//On demande a l'utilisateur les informations necessaires a un calcul de trajet
		System.out.println("Donner un arret de départ");
		String choix1 = Keyboard.getString();
		System.out.println("Donner un horaire de départ");
		String choix2 = Keyboard.getString();
		System.out.println("Donner un arret d'arrivé");
		String choix3 = Keyboard.getString();
		System.out.println("Le plus court, le plus rapide ou le plus tot ?");
		String choix4 = Keyboard.getString();
		
	
		
}
}