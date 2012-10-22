package frameworkjeu;

import frameworkjeu.NoeudDe;

/******************************************************
Cours : LOG121
Session : A2012
Groupe : 04
Projet : Laboratoire #1
�tudiant(e)(s) : Philippe Charbonneau
				 Patrice Robitaille
				 Mathieu Battah
Code(s) perm. :  CHAP07110906
                 ROBP2002805 
                 BATM19038902 
				
Professeur : Ghizlane El boussaidi
Charg� de labo  : Alvine Boaye Belle
Nom du fichier : CollectionDe.java
Date cr�� : 21-10-2012
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
	 * @param nbdes D�finit le nombre de des maximum pour la liste
	 */
	public CollectionDe(int nbDe){
		tailleListe = 0;
		maxDe = nbDe;
		nQueue = nSommet;
	}
	
	/**
	 * On r�cup�re le sommet de la liste
	 * 
	 * @return
	 */
	public NoeudDe getSommet() {
		return nSommet;
	}

	/**
	 * On d�finit le sommet de la liste
	 * 
	 * @param sommet
	 */
	public void setSommet(NoeudDe sommet) {
		nSommet = sommet;
	}

	/**
	 * On r�cup�re la queue de la liste
	 * 
	 * @return
	 */
	public NoeudDe getQueue() {
		return nQueue;
	}

	/**
	 * On d�finit la queue de la liste
	 * 
	 * @param queue
	 */
	public void setQueue(NoeudDe queue) {
		nQueue = queue;
	}
	
	/**
	 * 
	 * Ajouter un de � la partie
	 * 
	 * @param de
	 */
	
	/**	 
	 * M�thode servant � ajouter un noeud � la liste
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
	 * M�thode servant � d�terminer si 
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
	 * M�thode servant � d�terminer si 
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
	 * M�thode servant � obtenir la taille actuelle de
	 * la liste
	 *  
	 */
	public int obtenirTaille(){

		return tailleListe;
		
	}
	
	/**	 
	 * M�thode servant � obtenir la taille maximum de
	 * la liste
	 *  
	 */
	public int obternirTailleMaximum(){
		
		return maxDe;
	}
	
	/**
	 * 
	 * Initialisation de l'it�rateur de
	 * 
	 * @return
	 */
	public IterateurDe creerIterateur(){
		IterateurDe iterateur = new IterateurDe(this);
		
		return iterateur;
	}
	
}
