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
Nom du fichier : Fabrique.java
Date créé : 09-11-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public final class Fabrique {
	
	public static De creerDe(ArrayList<Object> listeFaces){
		return new De(listeFaces);
	}
	
	public static Joueur creerJoueur(String nom){
		return new Joueur(nom);
	}
	
}
