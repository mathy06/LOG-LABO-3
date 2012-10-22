package frameworkjeu;

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
Nom du fichier : AbstractJeu.java
Date créé : 19-10-2012
Date dern. modif. : 19-10-2012
*******************************************************/

public abstract class AbstractJeu {
	
	public void initialiserJeu(){}
	
	final void jouerPartie(){
		/* contient l'ordre d'appel des autres fonctions pour jouer au jeu. */
	}
	
	public void calculerScoreJoueur(){}
	
	public void calculerScoreDe(){}
	
	public void comparerScoreJoueur(){}
	
	public void partieTerminee(){}
	
}
