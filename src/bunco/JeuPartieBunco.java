package bunco;

import java.util.ArrayList;

import java.util.Collections;

import frameworkjeu.CollectionDe;
import frameworkjeu.CollectionJoueur;
import frameworkjeu.StrategieBunco;
import frameworkjeu.Fabrique;
import frameworkjeu.IStrategie;

/******************************************************
Cours : LOG121
Session : A2012
Groupe : 04
Projet : Laboratoire #2
Étudiant(e)(s) : Philippe Charbonneau
				 Patrice Robitaille
				 Mathieu Battah
Code(s) perm. :  CHAP07110906
                 ROBP2002805 
                 BATM19038902 
				
Professeur : Ghizlane El boussaidi
Chargé de labo  : Alvine Boaye Belle
Nom du fichier : JeuPartieBunco.java
Date créé : 02-11-2012
Date dern. modif. : 09-11-2012
*******************************************************/

public class JeuPartieBunco extends frameworkjeu.AbstractJeuPartie {

	int tours;
	private CollectionJoueur listeJoueurs;
	private CollectionDe listeDes;
	private StrategieBunco strategie;
	
	public int setNbTours(){
		return 3;
	}
	
	public CollectionJoueur creerListeJoueurs(){
		listeJoueurs = new CollectionJoueur();
		
		listeJoueurs.ajouterJoueur(Fabrique.creerJoueur("Patrice"));
		listeJoueurs.ajouterJoueur(Fabrique.creerJoueur("Mathieu"));
		listeJoueurs.ajouterJoueur(Fabrique.creerJoueur("Philippe"));
				
		return listeJoueurs;
	}
	
	public CollectionDe creerListeDes(){
		listeDes = new CollectionDe();
		
		ArrayList<Object> listeFaces = new ArrayList<Object>();
		Collections.addAll(listeFaces, 1,2,3,4,5,6);
		
		listeDes.ajouterDe(Fabrique.creerDe(listeFaces));
		listeDes.ajouterDe(Fabrique.creerDe(listeFaces));
		listeDes.ajouterDe(Fabrique.creerDe(listeFaces));
		
		return listeDes;
	}
	
	public IStrategie creerStrategie(){
		strategie = new StrategieBunco();
		return strategie;
	}
}
