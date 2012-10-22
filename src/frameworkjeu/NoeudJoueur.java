package frameworkjeu;

import frameworkjeu.Joueur;
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
Nom du fichier : NoeudJoueur.java
Date créé : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

/**
 * Classe gérant le noeud représantant un joueur dans la liste
 */
public class NoeudJoueur {

	private NoeudJoueur nSuivant;
	private NoeudJoueur nPrecedant;
	private Joueur joueur;
	
	//Constructor
	public NoeudJoueur(Joueur _joueur){
		nSuivant = null;
		nPrecedant = null;
		joueur = _joueur;		
	}
	
	public NoeudJoueur clone(){
		NoeudJoueur clone = new NoeudJoueur(joueur);
		clone.setPrecedant(nPrecedant);
		clone.setSuivant(nSuivant);
		return clone;
		
	}
	
	public Joueur getNoeud(){
		return joueur;
	}
	
	/**	 
	 * Méthode servant à défénir le noeud suivant
	 * 
	 * @param _suivant
	 */
	public void setSuivant(NoeudJoueur _suivant){
		nSuivant = _suivant;
	}
	
	/**	 
	 * Méthode servant à récupérer le noeud suivant
	 * 
	 * @param _suivant
	 */
	public NoeudJoueur getSuivant(){
		
		return nSuivant;
	}
	
	/**	 
	 * Méthode servant à déterminer si le noeud possède
	 * un noeud suivant
	 * 
	 * @param _suivant
	 */
	public boolean possedeSuivant(){
		
		return (nSuivant != null);
	}
	
	/**	 
	 * Méthode servant à définir le noeud précédant
	 * 
	 * @param _suivant
	 */
	public void setPrecedant(NoeudJoueur _precedant){
		nPrecedant = _precedant;
	}
	
	/**	 
	 * Méthode servant à récupérer le noeud précédant
	 * 
	 * @param _suivant
	 */
	public NoeudJoueur getPrecedant(){
		
		return nPrecedant;
	}
	
	/**	 
	 * Méthode servant à déterminer si le noeud possède
	 * un noeud précédant
	 * 
	 * @param _suivant
	 */
	public boolean possedePrecedant(){
				
		return (nPrecedant != null);
		
	}
	
}
