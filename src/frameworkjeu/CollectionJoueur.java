package frameworkjeu;

import java.util.ArrayList;

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
Nom du fichier : CollectionJoueur.java
Date créé : 21-10-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public class CollectionJoueur {
	
	private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
	
	/**	 
	 * Constructeur
	 */
	public CollectionJoueur(){}
	
	/**
	 * On récupère un joueur de la liste.
	 * @return joueur à la position spécifiée
	 */
	public Joueur getJoueur(int position){
		return listeJoueurs.get(position);
	}
	
	/**
	 * Taille de la collection.
	 * @return taille de la collection
	 */
	public int getTaille(){
		return listeJoueurs.size();
	}
	
	/**
	 * Ajoute un joueur à la collection.
	 * @param joueur à ajouter
	 */
	public void ajouterJoueur(Joueur joueur){
		listeJoueurs.add(joueur);
	}
		
	/**
	 * Crée un itérateur de joueur.
	 * @return itérateur de joueur
	 */
	public IterateurJoueur creerIterateur(){
		IterateurJoueur iterateur = new IterateurJoueur(this);
		
		return iterateur;
	}
	
}
