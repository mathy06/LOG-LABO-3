package frameworkjeu;

import java.util.ArrayList;

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
Nom du fichier : De.java
Date cr�� : 19-10-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public class De implements Comparable<De> {
	
	private ArrayList<Object> faces = new ArrayList<Object>();
	private Object valeur;
	
	/**
	 * Constructeur du d�.
	 * @param nombreFaces		Nombre de faces du d�
	 * @param facesDefinition	Collection contenant la valeur de chaque face du d�. 
	 * Doit etre pre-trier en ordre croissant pour assurer le bon fonctionnement des 
	 * calculs de score. Si la liste n'est pas trie, elle sera considere comme tel.
	 * 
	 */
	public De(ArrayList<Object> listeFaces){
		faces = listeFaces;
	}
	
	public ArrayList<Object> getListeFaces(){
		return faces;
	}
	
	/**
	 * Modifie la valeur actuelle du d�.
	 * @param nouvelle valeur du d�
	 */
	public void setValeur(Object nouvelleValeur){
		valeur = nouvelleValeur;
	}
	
	/**
	 * On r�cup�re la valeur du d�
	 * @return
	 */
	public Object getValeur(){
		return valeur;
	}
	
	/**
	 * Compare le score de 2 d�s.
	 * @return 	1 Si le score du d� appelant est plus �lev�.
	 * 			0 Si le score des 2 d�s sont �gaux.
	 * 			-1 Si le score du d� appelant est plus petit.
	 */
	public int compareTo(De deAComparer) {
		if(deAComparer == null)
			throw new IllegalArgumentException("Le param�tre De ne peut pas �tre null.");
		
		int resultat;
		
		if(this.faces.indexOf(valeur) > deAComparer.faces.indexOf(deAComparer.valeur)){
			resultat = 1;
		}
		else if(this.faces.indexOf(valeur) < deAComparer.faces.indexOf(deAComparer.valeur)){
			resultat = -1;
		}
		else{
			resultat = 0;
		}
		
		return resultat;
	}
}
