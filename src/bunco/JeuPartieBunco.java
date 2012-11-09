package bunco;

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
	private Fabrique fabrique;
	
	public int setNbTours(){
		return 3;
	}
	
	public CollectionJoueur creerListeJoueurs(){
		listeJoueurs = new CollectionJoueur();
		
		listeJoueurs.ajouterJoueur(fabrique.creerJoueur("Patrice"));
		listeJoueurs.ajouterJoueur(fabrique.creerJoueur("Mathieu"));
		listeJoueurs.ajouterJoueur(fabrique.creerJoueur("Philippe"));
				
		return listeJoueurs;
	}
	
	public CollectionDe creerListeDes(){
		listeDes = new CollectionDe();
		
		listeDes.ajouterDe(fabrique.creerDe(6));
		listeDes.ajouterDe(fabrique.creerDe(6));
		listeDes.ajouterDe(fabrique.creerDe(6));
		
		return listeDes;
	}
	
	public IStrategie creerStrategie(){
		strategie = new ConcreteStrategie();
		return strategie;
	}
}
