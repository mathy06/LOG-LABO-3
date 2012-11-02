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
Date dern. modif. : 19-10-2012
*******************************************************/

public class JeuPartie {
	
	private Jeu jeu;
	
	final void initialiserJeu(){
		CollectionJoueur listeJoueurs = creerListeJoueurs();
		CollectionDe listeDes = creerListeDes();
		jeu = creerJeu(1, listeJoueurs, listeDes);
	}
	
	public CollectionJoueur creerListeJoueurs(){
		return new CollectionJoueur();
	}
	
	public CollectionDe creerListeDes(){
		return new CollectionDe();
	}
	
	public Jeu creerJeu(int tours, CollectionJoueur joueurs, CollectionDe des){
		return new Jeu(tours, joueurs, des);
	}
	
	public void jouerPartie(){
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
