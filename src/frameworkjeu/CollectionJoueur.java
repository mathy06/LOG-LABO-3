package frameworkjeu;

import frameworkjeu.NoeudJoueur;

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
Nom du fichier : CollectionJoueur.java
Date créé : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

public class CollectionJoueur {
	
	private NoeudJoueur nSommet = new NoeudJoueur(null); //Premier Noeud de la liste
	private NoeudJoueur nQueue = new NoeudJoueur(null); //Dernier noeud de la liste
	private int maxJoueur; //Nombre de joueur maximum dans la liste
	private int tailleListe; //Taille actuelle de la liste
	
	/**	 
	 * Constructor
	 * 
	 * @param nbJoueurs Définit le nombre de joueurs maximum pour la liste
	 */
	public CollectionJoueur(int nbJoueurs){
		tailleListe = 0;
		maxJoueur = nbJoueurs;
		nQueue = nSommet;
	}
	
	/**
	 * On récupère le sommet de la liste
	 * 
	 * @return
	 */
	public NoeudJoueur getSommet() {
		return nSommet;
	}

	/**
	 * On définit le sommet de la liste
	 * 
	 * @param sommet
	 */
	public void setSommet(NoeudJoueur sommet) {
		nSommet = sommet;
	}

	/**
	 * On récupère la queue de la liste
	 * 
	 * @return
	 */
	public NoeudJoueur getQueue() {
		return nQueue;
	}

	/**
	 * On définit la queue de la liste
	 * 
	 * @param queue
	 */
	public void setQueue(NoeudJoueur queue) {
		nQueue = queue;
	}
	
	/**
	 * 
	 * Ajouter un joueur à la partie
	 * 
	 * @param joueur
	 */
	
	/**	 
	 * Méthode servant à ajouter un noeud à la liste
	 * 
	 * @param forme
	 * @throws Exception 
	 */
	public void ajouterNoeud(Joueur joueur) throws Exception{
		//Si la liste n'est pas pleine
		if(tailleListe<maxJoueur){
			if(estVide()){
				nSommet = nQueue = new NoeudJoueur(joueur);
			}else{	
				NoeudJoueur temporaire = new NoeudJoueur(joueur);
				nQueue.setSuivant(temporaire);
				temporaire.setPrecedant(nQueue);
				
				nQueue = temporaire;
			}
			tailleListe++;
		}else{
			throw new Exception("La liste de noeud est pleine. Maximum: "+maxJoueur);
		}
	}
	
	/**	 
	 * Méthode servant à déterminer si 
	 * la liste est pleine
	 *  
	 */
	public boolean estPleine(){

		if(tailleListe<maxJoueur){
			return false;
		}else{
			return true;
		}
	}
	
	/**	 
	 * Méthode servant à déterminer si 
	 * la liste est vide
	 *  
	 */
	public boolean estVide(){

		if(tailleListe>0){
			return false;
		}else{
			return true;
		}
	}
	
	
	/**	 
	 * Méthode servant à obtenir la taille actuelle de
	 * la liste
	 *  
	 */
	public int obtenirTaille(){

		return tailleListe;
		
	}
	
	/**	 
	 * Méthode servant à obtenir la taille maximum de
	 * la liste
	 *  
	 */
	public int obternirTailleMaximum(){
		
		return maxJoueur;
	}
	
	/**
	 * 
	 * Initialisation de l'itérateur Joueur
	 * 
	 * @return
	 */
	public IterateurJoueur creerIterateur(){
		IterateurJoueur iterateur = new IterateurJoueur(this);
		
		return iterateur;
	}
	
}
