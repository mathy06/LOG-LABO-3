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
Nom du fichier : AbstractJeuPartie.java
Date cr�� : 19-10-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public abstract class AbstractJeuPartie {
	
	private Jeu jeu;
	
	/**
	 * Initialise une instance de jeu.
	 */
	final void initialiserJeu(){
		int tours = getNbTours();
		CollectionJoueur listeJoueurs = creerListeJoueurs();
		CollectionDe listeDes = creerListeDes();
		IStrategie strategie = creerStrategie();
		
		jeu = new Jeu(tours, listeJoueurs, listeDes, strategie);
	}
	
	/**
	 * Retourne le nombre de tours du jeu.
	 * @return nombre de tours
	 */
	public abstract int getNbTours();
	
	/**
	 * Cr�e une liste de joueurs.
	 * @return liste de joueurs
	 */
	public abstract CollectionJoueur creerListeJoueurs();
	
	/**
	 * Cr�e une liste de d�s.
	 * @return liste de d�s
	 */
	public abstract CollectionDe creerListeDes();
	
	/**
	 * Cr�e la strat�gie du jeu.
	 * @return strat�gie du jeu
	 */
	public abstract IStrategie creerStrategie();
	
	/**
	 * Lance une partie d'un jeu.
	 */
	final void jouerPartie(){
		for(int i=1; i<=jeu.getNbTours(); i++){
			jeu.setTourCourant(i);
			jeu.calculerScoreTour();
		}
		
		jeu.calculerLeVainqueur();
	}
	
}
