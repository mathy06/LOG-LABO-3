package frameworkjeu;

import java.util.*;

public class De implements Comparable<De> {
	
	private int nbFaces;
	private int score;
	private Collection<Integer> faces;
	
	/**
	 * Constructeur du d�.
	 * @param nombreFaces		Nombre de faces du d�
	 * @param facesDefinition	Collection contenant la valeur de chaque face du d�
	 */
	public De(int nombreFaces, Collection<Integer> facesDefinition){
		nbFaces = nombreFaces;
		faces = facesDefinition;
	}
	
	/**
	 * Modifie la valeur du score du d�.
	 * @param nouveauScore Score du d�
	 */
	public void setScore(int nouveauScore){
		score = nouveauScore;
	}
	
	/**
	 * Compare le score de 2 d�s.
	 * @return 	1 Si le score du d� appelant est plus �lev�.
	 * 			0 Si le score des 2 d�s sont �gaux.
	 * 			-1 Si le score du d� appelant est plus petit.
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
