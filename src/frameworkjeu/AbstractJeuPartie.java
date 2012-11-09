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
Nom du fichier : JeuPartie.java
Date créé : 19-10-2012
Date dern. modif. : 09-11-2012
*******************************************************/

public abstract class AbstractJeuPartie {
	
	private Jeu jeu;
	int tours;
	private CollectionJoueur listeJoueurs;
	private CollectionDe listeDes;
	private IStrategie strategie;
	
	final void initialiserJeu(){
		tours = setNbTours();
		listeJoueurs = creerListeJoueurs();
		listeDes = creerListeDes();
		strategie = creerStrategie();
		
		jeu = new Jeu(tours, listeJoueurs, listeDes, strategie);
	}
	
	abstract int setNbTours();
	
	abstract CollectionJoueur creerListeJoueurs();
	
	abstract CollectionDe creerListeDes();
	
	abstract IStrategie creerStrategie();
	
	final void jouerPartie(){
		for(int i=1; i<=tours; i++){
			jeu.calculerScoreTour();
		}
		
		jeu.calculerLeVainqueur();
		
				//loop sur le nombre de tours
					//appeler calculer score tour
						//dans calculer score tour
						// loop sur collection de joueurs
							// loop sur collection de de pour setter valeur de chaque de
							// calculer score avec valeur des de, tour en cour et comparaison entre les de
							// ajouter le score au joueur en cours
							// determiner si on change de joueur ou si le joueur courant peut rejouer

	}
	
}
