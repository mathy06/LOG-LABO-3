package frameworkjeu;

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
Nom du fichier : IStrategie.java
Date cr�� : 09-11-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public interface IStrategie {
	
	/**
	 * Calcule le score d'un tour.
	 * @param jeu jeu d�finissant les joueurs, les d�s et le nombre de tours
	 */
	public void calculerScoreTour(Jeu jeu);
	
	/**
	 * Calcule le vainqueur du jeu.
	 * @param jeu jeu d�finissant les joueurs, les d�s et le nombre de tours
	 */
	public void calculerLeVainqueur(Jeu jeu);

}
