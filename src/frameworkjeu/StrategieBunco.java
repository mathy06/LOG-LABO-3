package frameworkjeu;

import java.util.Iterator;

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
Nom du fichier : StrategieBunco.java
Date créé : 09-11-2012
Date dern. modif. : 09-11-2012
*******************************************************/

public class StrategieBunco implements IStrategie{

	private CollectionJoueur listeJoueurs;
	private CollectionDe listeDes;
	private int tourCourant; 
	private final int POINTBUNCO = 21;
	private final int POINTDESIDENTIQUE = 5;
	
	/**
	 * Calcule le score d'un tour.
	 * Le calcul se fait en parcourant tous les joueurs et tous les dés
	 * 
	 * @param jeu jeu définissant les joueurs, les dés et le nombre de tours
	 */
	public void calculerScoreTour(Jeu jeu){

		tourCourant = jeu.getTourCourant();
		listeJoueurs = jeu.getJoueurs();
		listeDes = jeu.getDes();
		
		
		//On joue le tour pour chaque joueur
		for (Iterator<Joueur> i = listeJoueurs.creerIterateur(); i.hasNext(); ){
			Joueur joueur = i.next();
			
			boolean tourTermine = false;

			//Tant que le tour n'est pas terminé
			while(tourTermine==false){
				
				//On set une valeur à tous les dés
				for (Iterator<De> i2 = listeDes.creerIterateur(); i2.hasNext(); ){
					De deCourant = i2.next();
				
					//On définit la valeur du dé de façon random entre une valeur de 1 à nbFace de dé
					int random = (int)(Math.random() * (listeDes.getTaille()-1)) + 1;
					deCourant.setValeur(random);
				}
				
				//Si tous les dés sont identiques
				if(deIdentique()){
					
					int valeurDe = (Integer) listeDes.getDe(0).getValeur();
					
					if(tourCourant==valeurDe){
						//C'est un BUNCO!
						joueur.ajouterScore(POINTBUNCO);
						tourTermine=true;
					}else{
						joueur.ajouterScore(POINTDESIDENTIQUE);
					}
					
				}else{
					int score = calculerScoreUnitaire();
					
					if(score!=0){
						joueur.ajouterScore(score);
					}else{
						tourTermine=true;
					}
				}
				
			}
			
		}
	}
	
	/**
	 * Calcule le vainqueur du jeu.
	 * @param jeu jeu définissant les joueurs, les dés et le nombre de tours
	 */
	public CollectionJoueur calculerLeVainqueur(Jeu jeu){

		listeJoueurs = jeu.getJoueurs();
		CollectionJoueur joueursGagnants = new CollectionJoueur();
		
		Iterator<Joueur> iJoueur = listeJoueurs.creerIterateur();
		if(iJoueur.hasNext()){
			Joueur joueurGagnant = iJoueur.next();
			joueursGagnants.ajouterJoueur(joueurGagnant);
				
			while(iJoueur.hasNext()){
				Joueur joueurAComparer = iJoueur.next();
				int resultat = joueurGagnant.compareTo(joueurAComparer);
				//Si joueurAComparer a un score plus élevé.
				if(resultat == -1){
					joueurGagnant = joueurAComparer;
					joueursGagnants = new CollectionJoueur();
					joueursGagnants.ajouterJoueur(joueurGagnant);
				}
				//Si le score de joueurAComparer est égal à celui de joueurGagnant.
				else if(resultat == 0){
					joueursGagnants.ajouterJoueur(joueurAComparer);
				}
			}
		}
				
		return joueursGagnants;
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
			De deCourant = i.next();
			
			//On récupère la valeur du dé
			int valeur = (Integer) deCourant.getValeur();
			
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
		
		Iterator<De> iDe = listeDes.creerIterateur();
		boolean estIdentique = true;
		if(iDe.hasNext()){
			De de1 = iDe.next();
				
			while(iDe.hasNext()){
				De de2 = iDe.next();
				if(de1.compareTo(de2)!=0){
					estIdentique = false;
					break;
				}
			}
		}
		return estIdentique;
	}
	
}
