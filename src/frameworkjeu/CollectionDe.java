package frameworkjeu;

import java.util.ArrayList;

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
Nom du fichier : CollectionDe.java
Date créé : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

public class CollectionDe {
	
	private ArrayList<De> listeDe = new ArrayList<De>();
	
	/**	 
	 * Constructeur
	 */
	public CollectionDe(){}
	
	/**
	 * On récupère un dé de la liste.
	 * @return De à la position spécifiée
	 */
	public De getDe(int position) {
		return listeDe.get(position);
	}
	
	/**
	 * Taille de la collection.
	 * @return taille de la collection
	 */
	public int getTaille(){
		return listeDe.size();
	}
	
	/**
	 * Crée un itérateur de dé.
	 * @return itérateur de dé
	 */
	public IterateurDe creerIterateur(){
		IterateurDe iterateur = new IterateurDe(this);
		
		return iterateur;
	}
	
}
