package frameworkjeu;

import frameworkjeu.Iterateur;
import frameworkjeu.NoeudDe;
import frameworkjeu.CollectionDe;

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
Nom du fichier : IterateurDe.java
Date créé : 21-10-2012
Date dern. modif. : 21-10-2012
*******************************************************/

public class IterateurDe implements Iterateur{

	private CollectionDe listeDe;
	private NoeudDe courant;
	
	public IterateurDe(CollectionDe _listeDe){
		listeDe = _listeDe;
	}
	
	@Override
	public boolean possedePrecedant() {
		boolean reponse = false;
		if(courant == null){
			if(!listeDe.estVide())reponse = true;
		}
		else
			reponse = courant.possedePrecedant();
		return reponse;
		
	}

	@Override
	public boolean possedeSuivant() {
		boolean reponse = false;
		if(courant == null){
			if(!listeDe.estVide())reponse = true;
		}
		else
			reponse = courant.possedeSuivant();
		
		return reponse;
	
	}

	@Override
	public NoeudDe precedant() {
		
		if(courant == null){
			courant = listeDe.getQueue();
		}
		else if (courant.possedePrecedant()){
					
			courant = courant.getPrecedant();
				
		}else{
			return null;
		}
		return courant;
	}

	@Override
	public NoeudDe suivant() {
		
		if(courant == null){
			courant = listeDe.getSommet();
		}
		else if (courant.possedeSuivant()){
			courant = courant.getSuivant();
			
		}else{
			return null;
		}
		return courant;
		
	}
	
}
