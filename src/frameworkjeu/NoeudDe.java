package frameworkjeu;

import frameworkjeu.De;
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
Nom du fichier : NoeudDe.java
Date cr�� : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

/**
 * Classe g�rant le noeud repr�santant un de dans la liste
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
	 * M�thode servant � d�f�nir le noeud suivant
	 * 
	 * @param _suivant
	 */
	public void setSuivant(NoeudDe _suivant){
		nSuivant = _suivant;
	}
	
	/**	 
	 * M�thode servant � r�cup�rer le noeud suivant
	 * 
	 * @param _suivant
	 */
	public NoeudDe getSuivant(){
		
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
	public void setPrecedant(NoeudDe _precedant){
		nPrecedant = _precedant;
	}
	
	/**	 
	 * M�thode servant � r�cup�rer le noeud pr�c�dant
	 * 
	 * @param _suivant
	 */
	public NoeudDe getPrecedant(){
		
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
