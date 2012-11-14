package frameworkjeu;

import java.util.ArrayList;

/******************************************************
Cours : LOG121
Session : A2012
Groupe : 04
Projet : Laboratoire #2
�tudiant(e)(s) : Philippe Charbonneau
				 Patrice Robitaille
				 Mathieu Battah
Code(s) perm. :  CHAP07110906
                 ROBP2002805 
                 BATM19038902 
				
Professeur : Ghizlane El boussaidi
Charg� de labo  : Alvine Boaye Belle
Nom du fichier : Fabrique.java
Date cr�� : 09-11-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public final class Fabrique {
	
	/**
	 * Cr�e un d�.
	 * @param listeFaces
	 * @return d�
	 */
	public static De creerDe(ArrayList<Object> listeFaces){
		return new De(listeFaces);
	}
	
	/**
	 * Cr�e un joueur.
	 * @param nom
	 * @return joueur
	 */
	public static Joueur creerJoueur(String nom){
		return new Joueur(nom);
	}
	
}
