package tests;


import org.junit.*;
import org.easymock.EasyMock;


import frameworkjeu.CollectionJoueur;

import frameworkjeu.Joueur;

public class CollectionJoueurTest {
	
	private Joueur joueur1;
	private CollectionJoueur collecJoueur;
	
	@Before
	public void faireAvant(){
		joueur1 = EasyMock.createMock(Joueur.class);
	}
	
	@Test
	public void CollectionJoueurConstructTest(){
		collecJoueur = new CollectionJoueur();
		Assert.assertTrue(collecJoueur.getTaille() == 0);
	}
	
	@Test
	public void ajouterJoueurTest(){
		collecJoueur = new CollectionJoueur();
		for(int i=0;i<7;++i){
			collecJoueur.ajouterJoueur(joueur1);
		}
		Assert.assertTrue(collecJoueur.getTaille() == 7);
	}
	
	@Test
	public void getJoueurTest(){
		collecJoueur = new CollectionJoueur();
		joueur1 = new Joueur("Frank");
		Joueur joueur2 = new Joueur("Bob");
		
		collecJoueur.ajouterJoueur(joueur1);
		collecJoueur.ajouterJoueur(joueur2);
		
		Joueur joueur3 = collecJoueur.getJoueur(0);
		Assert.assertTrue(joueur1 == joueur3);
	}

}
