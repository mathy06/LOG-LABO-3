package bunco;

import java.util.ArrayList;
import java.util.Collections;

import frameworkjeu.CollectionDe;
import frameworkjeu.CollectionJoueur;
import frameworkjeu.ConcreteStrategie;
import frameworkjeu.Fabrique;
import frameworkjeu.IStrategie;

public class JeuPartieBunco extends frameworkjeu.AbstractJeuPartie {

	int tours;
	private CollectionJoueur listeJoueurs;
	private CollectionDe listeDes;
	private ConcreteStrategie strategie;
	
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
		strategie = new ConcreteStrategie();
		return strategie;
	}
}
