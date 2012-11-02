package frameworkjeu;

/******************************************************
Cours : LOG121
Session : A2012
Groupe : 04
Projet : Laboratoire #1
Étudiant(e)(s) : Philippe Charbonneau
				 Patrice Robitaille
				 Mathieu Battah
Code(s) perm. :  CHAP07110906
                 ROBP2002805 
                 BATM19038902 
				
Professeur : Ghizlane El boussaidi
Chargé de labo  : Alvine Boaye Belle
Nom du fichier : Jeu.java
Date créé : 02-11-2012
Date dern. modif. : 02-11-2012
*******************************************************/

public class Jeu {
	
	private int nbTours;
	private CollectionJoueur listeJoueurs;
	private CollectionDe listeDes;
	
	public Jeu(int tours, CollectionJoueur joueurs, CollectionDe des){
		nbTours = tours;
		listeJoueurs = joueurs;
		listeDes = des;
	}

}
