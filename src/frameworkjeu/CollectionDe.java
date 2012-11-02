package frameworkjeu;

import java.util.ArrayList;

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
Nom du fichier : CollectionDe.java
Date cr�� : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

public class CollectionDe {
	
	private ArrayList<De> listeDe = new ArrayList<De>();
	
	/**	 
	 * Constructeur
	 */
	public CollectionDe(){}
	
	/**
	 * On r�cup�re un d� de la liste.
	 * @return De � la position sp�cifi�e
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
	 * Cr�e un it�rateur de d�.
	 * @return it�rateur de d�
	 */
	public IterateurDe creerIterateur(){
		IterateurDe iterateur = new IterateurDe(this);
		
		return iterateur;
	}
	
}
