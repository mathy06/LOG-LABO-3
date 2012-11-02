package frameworkjeu;

import java.util.Iterator;

import frameworkjeu.CollectionDe;

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
Nom du fichier : IterateurDe.java
Date créé : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

public class IterateurDe implements Iterator<De>{

	private CollectionDe listeDe;
	int position = 0;
	
	/**
	 * Constructeur
	 * @param _listeDe collection de dé
	 */
	public IterateurDe(CollectionDe _listeDe){
		this.listeDe = _listeDe;
	}
	
	/**
	 * Détermine s'il y a un prochain dé dans la liste.
	 * @return vrai s'il y a un suivant, sinon faux
	 */
	public boolean hasNext() {
		if(position >= listeDe.getTaille() || listeDe.getDe(position) == null){
			return false;
		}
		else{
			return true;
		}
	}

	/**
	 * Retourne le prochain dé.
	 * @return le prochain dé de la liste
	 */
	public De next() {
		De de = listeDe.getDe(position);
		position++;
		return de;
	}

	/**
	 * Non utilisé.
	 */
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
