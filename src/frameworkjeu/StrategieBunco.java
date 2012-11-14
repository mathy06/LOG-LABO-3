package frameworkjeu;

import java.util.Iterator;

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
Nom du fichier : StrategieBunco.java
Date cr�� : 09-11-2012
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
	 * Le calcul se fait en parcourant tous les joueurs et tous les d�s
	 * 
	 * @param jeu jeu d�finissant les joueurs, les d�s et le nombre de tours
	 */
	public void calculerScoreTour(Jeu jeu){

		tourCourant = jeu.getTourCourant();
		listeJoueurs = jeu.getJoueurs();
		listeDes = jeu.getDes();
		
		
		//On joue le tour pour chaque joueur
		for (Iterator<Joueur> i = listeJoueurs.creerIterateur(); i.hasNext(); ){
			Joueur joueur = i.next();
			
			boolean tourTermine = false;

			//Tant que le tour n'est pas termin�
			while(tourTermine==false){
				
				//On set une valeur � tous les d�s
				for (Iterator<De> i2 = listeDes.creerIterateur(); i2.hasNext(); ){
					De deCourant = i2.next();
				
					//On d�finit la valeur du d� de fa�on random entre une valeur de 1 � nbFace de d�
					int random = (int)(Math.random() * (listeDes.getTaille()-1)) + 1;
					deCourant.setValeur(random);
				}
				
				//Si tous les d�s sont identiques
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
	 * @param jeu jeu d�finissant les joueurs, les d�s et le nombre de tours
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
				//Si joueurAComparer a un score plus �lev�.
				if(resultat == -1){
					joueurGagnant = joueurAComparer;
					joueursGagnants = new CollectionJoueur();
					joueursGagnants.ajouterJoueur(joueurGagnant);
				}
				//Si le score de joueurAComparer est �gal � celui de joueurGagnant.
				else if(resultat == 0){
					joueursGagnants.ajouterJoueur(joueurAComparer);
				}
			}
		}
				
		return joueursGagnants;
	}
	
	/**
	 * On calcul le nombre de point que les d�s peuvent rapporter
	 * on comparant la valeur des d�s avec le num�ro du tour actuel
	 * 
	 * @return int
	 */
	private int calculerScoreUnitaire(){
		
		//On d�finit le nombre de point
		int score = 0;
		
		for (Iterator<De> i = listeDes.creerIterateur(); i.hasNext(); ){
			De deCourant = i.next();
			
			//On r�cup�re la valeur du d�
			int valeur = (Integer) deCourant.getValeur();
			
			//Si le d� poss�de la m�me valeur que le num�ro de tour
			if(valeur==tourCourant){
				score++;
			}
		}
		
		return score;
	}
	
	/**
	 * V�rification de tous les d�s pour savoir s'ils sont identique ou non
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
