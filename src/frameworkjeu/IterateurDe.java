package frameworkjeu;

import java.util.Iterator;

import frameworkjeu.CollectionDe;

/******************************************************
Cours : LOG121
Session : A2012
Groupe : 04
Projet : Laboratoire #1
�tudiant(e)(s) : Philippe Charbonneau
				 Patrice Robitaille
				 Mathieu Battah
Code(s) perm. :  CHAP07110906
                 ROBP2002805 
                 BATM19038902 
				
Professeur : Ghizlane El boussaidi
Charg� de labo  : Alvine Boaye Belle
Nom du fichier : IterateurDe.java
Date cr�� : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

public class IterateurDe implements Iterator<De>{

	private CollectionDe listeDe;
	int position = 0;
	
	/**
	 * Constructeur
	 * @param _listeDe collection de d�
	 */
	public IterateurDe(CollectionDe _listeDe){
		this.listeDe = _listeDe;
	}
	
	/**
	 * D�termine s'il y a un prochain d� dans la liste.
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
	 * Retourne le prochain d�.
	 * @return le prochain d� de la liste
	 */
	public De next() {
		De de = listeDe.getDe(position);
		position++;
		return de;
	}

	/**
	 * Non utilis�.
	 */
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
