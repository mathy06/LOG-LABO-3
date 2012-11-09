package frameworkjeu;

import java.util.ArrayList;

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
Nom du fichier : De.java
Date créé : 19-10-2012
Date dern. modif. : 19-10-2012
*******************************************************/

public class De implements Comparable<De> {
	
	private ArrayList<Object> faces = new ArrayList<Object>();
	private Object valeur;
	
	/**
	 * Constructeur du dé.
	 * @param nombreFaces		Nombre de faces du dé
	 * @param facesDefinition	Collection contenant la valeur de chaque face du dé
	 */
	public De(ArrayList<Object> listeFaces){
		faces = listeFaces;
	}
	
	/**
	 * Modifie la valeur actuelle du dé.
	 * @param nouvelle valeur du dé
	 */
	public void setValeur(Object nouvelleValeur){
		valeur = nouvelleValeur;
	}
	
	/**
	 * Compare le score de 2 dés.
	 * @return 	1 Si le score du dé appelant est plus élevé.
	 * 			0 Si le score des 2 dés sont égaux.
	 * 			-1 Si le score du dé appelant est plus petit.
	 */
	public int compareTo(De de) {
		if(de == null)
			throw new IllegalArgumentException("Le paramètre De ne peut pas être null.");
		
		int resultat;
		
		if(this.faces.indexOf(valeur) > de.faces.indexOf(de.valeur)){
			resultat = 1;
		}
		else if(this.faces.indexOf(valeur) < de.faces.indexOf(de.valeur)){
			resultat = -1;
		}
		else{
			resultat = 0;
		}
		
		return resultat;
	}
}
