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
Nom du fichier : AbstractJeuPartie.java
Date créé : 19-10-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public abstract class AbstractJeuPartie {
	
	private Jeu jeu;
	
	final void initialiserJeu(){
		int tours = getNbTours();
		CollectionJoueur listeJoueurs = creerListeJoueurs();
		CollectionDe listeDes = creerListeDes();
		IStrategie strategie = creerStrategie();
		
		jeu = new Jeu(tours, listeJoueurs, listeDes, strategie);
	}
	
	public abstract int getNbTours();
	
	public abstract CollectionJoueur creerListeJoueurs();
	
	public abstract CollectionDe creerListeDes();
	
	public abstract IStrategie creerStrategie();
	
	final void jouerPartie(){
		for(int i=1; i<=jeu.getNbTours(); i++){
			jeu.setTourCourant(i);
			jeu.calculerScoreTour();
		}
		
		jeu.calculerLeVainqueur();
	}
	
}
