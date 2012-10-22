package frameworkjeu;

import frameworkjeu.NoeudDe;

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
Nom du fichier : CollectionDe.java
Date créé : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

public class CollectionDe {
	
	private NoeudDe nSommet = new NoeudDe(null); //Premier Noeud de la liste
	private NoeudDe nQueue = new NoeudDe(null); //Dernier noeud de la liste
	private int maxDe; //Nombre de de maximum dans la liste
	private int tailleListe; //Taille actuelle de la liste
	
	/**	 
	 * Constructor
	 * 
	 * @param nbdes Définit le nombre de des maximum pour la liste
	 */
	public CollectionDe(int nbDe){
		tailleListe = 0;
		maxDe = nbDe;
		nQueue = nSommet;
	}
	
	/**
	 * On récupère le sommet de la liste
	 * 
	 * @return
	 */
	public NoeudDe getSommet() {
		return nSommet;
	}

	/**
	 * On définit le sommet de la liste
	 * 
	 * @param sommet
	 */
	public void setSommet(NoeudDe sommet) {
		nSommet = sommet;
	}

	/**
	 * On récupère la queue de la liste
	 * 
	 * @return
	 */
	public NoeudDe getQueue() {
		return nQueue;
	}

	/**
	 * On définit la queue de la liste
	 * 
	 * @param queue
	 */
	public void setQueue(NoeudDe queue) {
		nQueue = queue;
	}
	
	/**
	 * 
	 * Ajouter un de à la partie
	 * 
	 * @param de
	 */
	
	/**	 
	 * Méthode servant à ajouter un noeud à la liste
	 * 
	 * @param forme
	 * @throws Exception 
	 */
	public void ajouterNoeud(De de) throws Exception{
		//Si la liste n'est pas pleine
		if(tailleListe<maxDe){
			if(estVide()){
				nSommet = nQueue = new NoeudDe(de);
			}else{	
				NoeudDe temporaire = new NoeudDe(de);
				nQueue.setSuivant(temporaire);
				temporaire.setPrecedant(nQueue);
				
				nQueue = temporaire;
			}
			tailleListe++;
		}else{
			throw new Exception("La liste de noeud est pleine. Maximum: "+maxDe);
		}
	}
	
	/**	 
	 * Méthode servant à déterminer si 
	 * la liste est pleine
	 *  
	 */
	public boolean estPleine(){

		if(tailleListe<maxDe){
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
		
		return maxDe;
	}
	
	/**
	 * 
	 * Initialisation de l'itérateur de
	 * 
	 * @return
	 */
	public IterateurDe creerIterateur(){
		IterateurDe iterateur = new IterateurDe(this);
		
		return iterateur;
	}
	
}
