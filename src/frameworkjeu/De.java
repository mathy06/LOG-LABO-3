package frameworkjeu;

import java.util.*;

public class De implements Comparable<De> {
	
	private int nbFaces;
	private int score;
	private Collection<Integer> faces;
	
	/**
	 * Constructeur du dé.
	 * @param nombreFaces		Nombre de faces du dé
	 * @param facesDefinition	Collection contenant la valeur de chaque face du dé
	 */
	public De(int nombreFaces, Collection<Integer> facesDefinition){
		nbFaces = nombreFaces;
		faces = facesDefinition;
	}
	
	/**
	 * Modifie la valeur du score du dé.
	 * @param nouveauScore Score du dé
	 */
	public void setScore(int nouveauScore){
		score = nouveauScore;
	}
	
	/**
	 * Compare le score de 2 dés.
	 * @return 	1 Si le score du dé appelant est plus élevé.
	 * 			0 Si le score des 2 dés sont égaux.
	 * 			-1 Si le score du dé appelant est plus petit.
	 */
	public int compareTo(De de) {
		int resultat;
		
		if(this.score > de.score){
			resultat = 1;
		}
		else if(this.score < de.score){
			resultat = -1;
		}
		else{
			resultat = 0;
		}
		
		return resultat;
	}
}
