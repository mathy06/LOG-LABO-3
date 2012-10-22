package frameworkjeu;

import frameworkjeu.De;
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
Nom du fichier : NoeudDe.java
Date créé : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

/**
 * Classe gérant le noeud représantant un de dans la liste
 */
public class NoeudDe {

	private NoeudDe nSuivant;
	private NoeudDe nPrecedant;
	private De de;
	
	//Constructor
	public NoeudDe(De _de){
		nSuivant = null;
		nPrecedant = null;
		de = _de;		
	}
	
	public NoeudDe clone(){
		NoeudDe clone = new NoeudDe(de);
		clone.setPrecedant(nPrecedant);
		clone.setSuivant(nSuivant);
		return clone;
		
	}
	
	public De getNoeud(){
		return de;
	}
	
	/**	 
	 * Méthode servant à défénir le noeud suivant
	 * 
	 * @param _suivant
	 */
	public void setSuivant(NoeudDe _suivant){
		nSuivant = _suivant;
	}
	
	/**	 
	 * Méthode servant à récupérer le noeud suivant
	 * 
	 * @param _suivant
	 */
	public NoeudDe getSuivant(){
		
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
	public void setPrecedant(NoeudDe _precedant){
		nPrecedant = _precedant;
	}
	
	/**	 
	 * Méthode servant à récupérer le noeud précédant
	 * 
	 * @param _suivant
	 */
	public NoeudDe getPrecedant(){
		
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
