package frameworkjeu;

import java.util.Iterator;

public class ConcreteStrategie implements IStrategie{

	private CollectionJoueur listeJoueurs;
	private CollectionDe listeDes;
	
	/**
	 * Calcule le score d'un tour.
	 * Le calcul se fait en parcourant tous les joueurs et tous les d�s
	 * 
	 * @param jeu jeu d�finissant les joueurs, les d�s et le nombre de tours
	 */
	public void calculerScoreTour(Jeu jeu){
		
		listeJoueurs = jeu.getJoueurs();
		
		for (Iterator i = listeJoueurs.creerIterateur(); i.hasNext(); ){
			Joueur joueur = (Joueur) i.next();
			for (Iterator i2 = listeDes.creerIterateur(); i2.hasNext(); ){
				De de = (De) i2.next();
				
				int nbFaces = de.getNbFaces(); //Le nombre de faces possible au d�
				int lower = 1; //La valeur de la plus petite face possible
				
				//On d�finit la valeur du d� de fa�on random
				int random = (int)(Math.random() * (nbFaces-lower)) + lower;
				
				de.setValeur(random);
			}
		}
		
		
		//dans calculer score tour
		// loop sur collection de joueurs
			// loop sur collection de de pour setter valeur de chaque de
			// calculer score avec valeur des de, tour en cour et comparaison entre les de
			// ajouter le score au joueur en cours
			// determiner si on change de joueur ou si le joueur courant peut rejouer
	}
	/**
	 * Calcule le vainqueur du jeu.
	 * @param jeu jeu d�finissant les joueurs, les d�s et le nombre de tours
	 */
	public void calculerLeVainqueur(Jeu jeu){
		
	}
	
}
