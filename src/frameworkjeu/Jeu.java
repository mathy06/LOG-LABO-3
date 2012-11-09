package frameworkjeu;

/******************************************************
Cours : LOG121
Session : A2012
Groupe : 04
Projet : Laboratoire #2
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
Date dern. modif. : 09-11-2012
*******************************************************/

public class Jeu {
	
	private int nbTours;
	private CollectionJoueur listeJoueurs;
	private CollectionDe listeDes;
	private IStrategie strategie;
	
	/**
	 * Constructeur de jeu de dé.
	 * @param tours Nombre de tours
	 * @param joueurs Collection des joueurs
	 * @param des Collection des dés
	 */
	public Jeu(int tours, CollectionJoueur joueurs, CollectionDe des, IStrategie jeuStrategie){
		nbTours = tours;
		listeJoueurs = joueurs;
		listeDes = des;
		strategie = jeuStrategie;
	}
	
	/**
	 * Calcule le score d'un tour.
	 */
	public void calculerScoreTour(){
		strategie.calculerScoreTour(this);
	}
	
	/**
	 * Retourne le joueur ayant gagné le jeu.
	 * @return Joueur gagant
	 */
	public void calculerLeVainqueur(){
		strategie.calculerLeVainqueur(this);
	}

	
	public CollectionJoueur getJoueurs(){
		return listeJoueurs;
	}
	
	public CollectionDe getDes(){
		return listeDes;
	}
}
