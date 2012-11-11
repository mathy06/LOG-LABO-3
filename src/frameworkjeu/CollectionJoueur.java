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
Nom du fichier : CollectionJoueur.java
Date cr�� : 21-10-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public class CollectionJoueur {
	
	private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
	
	/**	 
	 * Constructeur
	 */
	public CollectionJoueur(){}
	
	/**
	 * On r�cup�re un joueur de la liste.
	 * @return joueur � la position sp�cifi�e
	 */
	public Joueur getJoueur(int position){
		return listeJoueurs.get(position);
	}
	
	/**
	 * Taille de la collection.
	 * @return taille de la collection
	 */
	public int getTaille(){
		return listeJoueurs.size();
	}
	
	/**
	 * Ajoute un joueur � la collection.
	 * @param joueur � ajouter
	 */
	public void ajouterJoueur(Joueur joueur){
		listeJoueurs.add(joueur);
	}
		
	/**
	 * Cr�e un it�rateur de joueur.
	 * @return it�rateur de joueur
	 */
	public IterateurJoueur creerIterateur(){
		IterateurJoueur iterateur = new IterateurJoueur(this);
		
		return iterateur;
	}
	
}
