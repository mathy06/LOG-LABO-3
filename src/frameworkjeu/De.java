package frameworkjeu;

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
Nom du fichier : De.java
Date cr�� : 19-10-2012
Date dern. modif. : 19-10-2012
*******************************************************/

public class De implements Comparable<De> {
	
	private int nbFaces;
	private int valeur;
	
	/**
	 * Constructeur du d�.
	 * @param nombreFaces		Nombre de faces du d�
	 * @param facesDefinition	Collection contenant la valeur de chaque face du d�
	 */
	public De(int nombreFaces){
		nbFaces = nombreFaces;
	}
	
	/**
	 * On r�cup�re le nombre de faces sur le d�
	 * @return
	 */
	public int getNbFaces(){
		return nbFaces;
	}
	
	/**
	 * Effectue le lancement du de
	 */
	public void lancerDe(){
		valeur = (int) (Math.random() * ( nbFaces - 1 ));
	}
	
	/**
	 * Compare le score de 2 d�s.
	 * @return 	1 Si le score du d� appelant est plus �lev�.
	 * 			0 Si le score des 2 d�s sont �gaux.
	 * 			-1 Si le score du d� appelant est plus petit.
	 */
	public int compareTo(De de) {
		int resultat;
		
		if(this.valeur > de.valeur){
			resultat = 1;
		}
		else if(this.valeur < de.valeur){
			resultat = -1;
		}
		else{
			resultat = 0;
		}
		
		return resultat;
	}
}
