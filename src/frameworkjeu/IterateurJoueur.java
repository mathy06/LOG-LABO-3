package frameworkjeu;

import frameworkjeu.Iterateur;
import frameworkjeu.NoeudJoueur;
import frameworkjeu.CollectionJoueur;

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
Nom du fichier : IterateurJoueur.java
Date créé : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

public class IterateurJoueur implements Iterateur{

	private CollectionJoueur listeJoueurs;
	private NoeudJoueur courant;
	
	public IterateurJoueur(CollectionJoueur _listeJoueurs){
		listeJoueurs = _listeJoueurs;
	}
	
	@Override
	public boolean possedePrecedant() {
		boolean reponse = false;
		if(courant == null){
			if(!listeJoueurs.estVide())reponse = true;
		}
		else
			reponse = courant.possedePrecedant();
		return reponse;
		
	}

	@Override
	public boolean possedeSuivant() {
		boolean reponse = false;
		if(courant == null){
			if(!listeJoueurs.estVide())reponse = true;
		}
		else
			reponse = courant.possedeSuivant();
		
		return reponse;
	
	}

	@Override
	public NoeudJoueur precedant() {
		
		if(courant == null){
			courant = listeJoueurs.getQueue();
		}
		else if (courant.possedePrecedant()){
					
			courant = courant.getPrecedant();
				
		}else{
			return null;
		}
		return courant;
	}

	@Override
	public NoeudJoueur suivant() {
		
		if(courant == null){
			courant = listeJoueurs.getSommet();
		}
		else if (courant.possedeSuivant()){
			courant = courant.getSuivant();
			
		}else{
			return null;
		}
		return courant;
		
	}
	
}
