package frameworkjeu;

import frameworkjeu.Joueur;
import frameworkjeu.NoeudJoueur;
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
Nom du fichier : NoeudJoueur.java
Date cr�� : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

/**
 * Classe g�rant le noeud repr�santant un joueur dans la liste
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
	 * M�thode servant � d�f�nir le noeud suivant
	 * 
	 * @param _suivant
	 */
	public void setSuivant(NoeudJoueur _suivant){
		nSuivant = _suivant;
	}
	
	/**	 
	 * M�thode servant � r�cup�rer le noeud suivant
	 * 
	 * @param _suivant
	 */
	public NoeudJoueur getSuivant(){
		
		return nSuivant;
	}
	
	/**	 
	 * M�thode servant � d�terminer si le noeud poss�de
	 * un noeud suivant
	 * 
	 * @param _suivant
	 */
	public boolean possedeSuivant(){
		
		return (nSuivant != null);
	}
	
	/**	 
	 * M�thode servant � d�finir le noeud pr�c�dant
	 * 
	 * @param _suivant
	 */
	public void setPrecedant(NoeudJoueur _precedant){
		nPrecedant = _precedant;
	}
	
	/**	 
	 * M�thode servant � r�cup�rer le noeud pr�c�dant
	 * 
	 * @param _suivant
	 */
	public NoeudJoueur getPrecedant(){
		
		return nPrecedant;
	}
	
	/**	 
	 * M�thode servant � d�terminer si le noeud poss�de
	 * un noeud pr�c�dant
	 * 
	 * @param _suivant
	 */
	public boolean possedePrecedant(){
				
		return (nPrecedant != null);
		
	}
	
}
