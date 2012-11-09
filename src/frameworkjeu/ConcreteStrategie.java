package frameworkjeu;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcreteStrategie implements IStrategie{

	private CollectionJoueur listeJoueurs;
	private CollectionDe listeDes;
	private int tourCourant;
	
	/**
	 * Calcule le score d'un tour.
	 * Le calcul se fait en parcourant tous les joueurs et tous les dés
	 * 
	 * @param jeu jeu définissant les joueurs, les dés et le nombre de tours
	 */
	public void calculerScoreTour(Jeu jeu){

		tourCourant = jeu.getTourCourant();
		listeJoueurs = jeu.getJoueurs();
		
		//On joue le tour pour chaque joueur
		for (Iterator<Joueur> i = listeJoueurs.creerIterateur(); i.hasNext(); ){
			Joueur joueur = i.next();
			
			boolean tourTermine = false;

			//Tant que le tour n'est pas terminé
			while(tourTermine==false){
				
				//On set une valeur à tous les dés
				for (Iterator<De> i2 = listeDes.creerIterateur(); i2.hasNext(); ){
					De de = i2.next();
				
					//On définit la valeur du dé de façon random entre une valeur de 1 à 6
					int random = (int)(Math.random() * (6-1)) + 1;
					
					ArrayList<Object> faces = de.getListeFaces();
					de.setValeur(faces.get(random));
				}
				
				//Si tous les dés sont identiques
				if(deIdentique()){
					
					int valeurDe = (Integer) listeDes.getDe(1).getValeur();
					
					if(tourCourant==valeurDe){
						//C'est un BUNCO!
						joueur.ajouterScore(21);
						tourTermine=true;
					}else{
						joueur.ajouterScore(5);
						tourTermine=false;
					}
					
				}else{
					int score = calculerScoreUnitaire();
					
					if(score!=0){
						joueur.ajouterScore(score);
					}else{
						tourTermine=false;
					}
				}
				
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
	 * @param jeu jeu définissant les joueurs, les dés et le nombre de tours
	 */
	public void calculerLeVainqueur(Jeu jeu){
		
	}
	
	/**
	 * On calcul le nombre de point que les dés peuvent rapporter
	 * on comparant la valeur des dés avec le numéro du tour actuel
	 * 
	 * @return int
	 */
	private int calculerScoreUnitaire(){
		
		//On définit le nombre de point
		int score = 0;
		
		for (Iterator<De> i = listeDes.creerIterateur(); i.hasNext(); ){
			De de = i.next();
			
			//On récupère la valeur du dé
			int valeur = (Integer) de.getValeur();
			
			//Si le dé possède la même valeur que le numéro de tour
			if(valeur==tourCourant){
				score++;
			}
		}
		
		return score;
	}
	
	/**
	 * Vérification de tous les dés pour savoir s'ils sont identique ou non
	 * @return boolean
	 */
	private boolean deIdentique(){
				
		for (Iterator<De> i = listeDes.creerIterateur(); i.hasNext(); ){
			De de = i.next();
		
			for (Iterator<De> i2 = listeDes.creerIterateur(); i2.hasNext(); ){
				De de2 = i2.next();
				if(de.compareTo(de2)!=0){
					return false;
				}
			}			
		}
		
		return true;
		
	}
	
}
