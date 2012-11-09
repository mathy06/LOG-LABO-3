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
Nom du fichier : IStrategie.java
Date créé : 09-11-2012
Date dern. modif. : 09-11-2012
*******************************************************/

public interface IStrategie {
	
	/**
	 * Calcule le score d'un tour.
	 * @param jeu jeu définissant les joueurs, les dés et le nombre de tours
	 */
	public void calculerScoreTour(Jeu jeu);
	//dans calculer score tour
	// loop sur collection de joueurs
		// loop sur collection de de pour setter valeur de chaque de
		// calculer score avec valeur des de, tour en cour et comparaison entre les de
		// ajouter le score au joueur en cours
		// determiner si on change de joueur ou si le joueur courant peut rejouer
	
	/**
	 * Calcule le vainqueur du jeu.
	 * @param jeu jeu définissant les joueurs, les dés et le nombre de tours
	 */
	public void calculerLeVainqueur(Jeu jeu);

}
