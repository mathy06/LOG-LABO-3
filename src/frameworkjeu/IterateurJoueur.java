package frameworkjeu;

import java.util.Iterator;

import frameworkjeu.CollectionJoueur;

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
Nom du fichier : IterateurJoueur.java
Date créé : 21-10-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public class IterateurJoueur implements Iterator<Joueur>{

	private CollectionJoueur listeJoueurs;
	int position = 0;
	
	public IterateurJoueur(CollectionJoueur _listeJoueurs){
		listeJoueurs = _listeJoueurs;
	}
	
	/**
	 * Détermine s'il y a un prochain joueur dans la liste.
	 * @return vrai s'il y a un suivant, sinon faux
	 */
	public boolean hasNext() {
		if(position >= listeJoueurs.getTaille() || listeJoueurs.getJoueur(position) == null){
			return false;
		}
		else{
			return true;
		}
	}

	/**
	 * Retourne le prochain joueur et avance l'itérateur.
	 * @return le prochain joueur de la liste
	 */
	public Joueur next() {
		Joueur joueur = listeJoueurs.getJoueur(position);
		position++;
		return joueur;
	}

	/**
	 * Non utilisé.
	 */
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
