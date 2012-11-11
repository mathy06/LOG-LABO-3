package tests;

import org.junit.*;
import org.easymock.EasyMock;

import java.util.ArrayList;
import java.util.Collections;

import frameworkjeu.CollectionDe;
import frameworkjeu.CollectionJoueur;
import frameworkjeu.StrategieBunco;
import frameworkjeu.De;
import frameworkjeu.Jeu;
import frameworkjeu.Joueur;

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
Nom du fichier : StrategieBuncoTest.java
Date créé : 09-11-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public class StrategieBuncoTest {
	
	private StrategieBunco strategieBunco;
	private Jeu jeu;
	private Joueur joueur1;
	private Joueur joueur2;
	private De de1;
	private De de2;
	private De de3;
	
	@Before
	public void faireAvant(){
		//Mock la classe De pour contrôler la valeur des dés.
		de1 = EasyMock.createMock(De.class);
		de2 = EasyMock.createMock(De.class);
		de3 = EasyMock.createMock(De.class);
		
		//Création de 2 joueurs
		CollectionJoueur listejoueurs = new CollectionJoueur();
		joueur1 = new Joueur("Test1");
		joueur2 = new Joueur("Test2");
		listejoueurs.ajouterJoueur(joueur1);
		listejoueurs.ajouterJoueur(joueur2);
		
		//Création de la liste des faces des dés
		ArrayList<Object> listeFaces = new ArrayList<Object>();
		Collections.addAll(listeFaces, 1,2,3,4,5,6);
		
		//Création de 3 dés pour le jeu Bunco+
		CollectionDe listeDes = new CollectionDe();
		listeDes.ajouterDe(de1);
		listeDes.ajouterDe(de2);
		listeDes.ajouterDe(de3);
		
		//Création de la strategie Bunco+
		strategieBunco = new StrategieBunco();
		
		//Création du jeu Bunco+ avec 1 tour pour faciliter les tests.
		jeu = new Jeu(1, listejoueurs, listeDes, strategieBunco);
	}
	

	@Test
	public void calculerScoreTourUnDeEgalTourTest() {		
		//Simule les appels à setValeur pour les dés.
		de1.setValeur(EasyMock.anyInt());
		EasyMock.expectLastCall().anyTimes();
		de2.setValeur(EasyMock.anyInt());
		EasyMock.expectLastCall().anyTimes();
		de3.setValeur(EasyMock.anyInt());
		EasyMock.expectLastCall().anyTimes();
		
		//Simule les appels de comparaison entre les dés.
		EasyMock.expect(de1.compareTo(de1)).andReturn(1).times(3);
		
		//Joueur1 lance 3 fois obtient les valeurs 1, 3 et 3 au tour 1.
		//Il a fait des points c'est encore à lui de lancer les dés.
		EasyMock.expect(de1.getValeur()).andReturn(1);
		EasyMock.expect(de2.getValeur()).andReturn(3);
		EasyMock.expect(de3.getValeur()).andReturn(3);

		//Joueur1 relance les dés parce qu'il a fait des points et obtient 2, 3 et 3 au tour 1.
		//Pas de point, c'est au joueur suivant.
		EasyMock.expect(de1.getValeur()).andReturn(2);
		EasyMock.expect(de2.getValeur()).andReturn(3);
		EasyMock.expect(de3.getValeur()).andReturn(3);

		//Joueur 2 lance les dés parce qu'il a fait des points et obtient 2, 3 et 3 au tour 1.
		//Pas de point, le tour est fini.
		EasyMock.expect(de1.getValeur()).andReturn(2);
		EasyMock.expect(de2.getValeur()).andReturn(3);
		EasyMock.expect(de3.getValeur()).andReturn(3);
		
		//Rend les dés disponible pour utilisation.
		EasyMock.replay(de1);
		EasyMock.replay(de2);
		EasyMock.replay(de3);
		
		strategieBunco.calculerScoreTour(jeu);
		
		//Vérifie que les dés ont été appelés tel que définis.
		EasyMock.verify(de1);
		EasyMock.verify(de2);
		EasyMock.verify(de3);
		
		//Conditions de réussite.
		Assert.assertTrue(joueur1.getScore() == 1);
		Assert.assertTrue(joueur2.getScore() == 0);
	}
	
	@Test
	public void calculerScoreTourAucunPointTest() {		
		//Simule les appels à setValeur pour les dés.
		de1.setValeur(EasyMock.anyInt());
		EasyMock.expectLastCall().anyTimes();
		de2.setValeur(EasyMock.anyInt());
		EasyMock.expectLastCall().anyTimes();
		de3.setValeur(EasyMock.anyInt());
		EasyMock.expectLastCall().anyTimes();
		
		//Simule les appels de comparaison entre les dés.
		EasyMock.expect(de1.compareTo(de1)).andReturn(1).times(2);
		
		//Joueur1 lance 3 fois obtient les valeurs 1, 3 et 3 au tour 1.
		//Pas de point, c'est au joueur suivant.
		EasyMock.expect(de1.getValeur()).andReturn(2);
		EasyMock.expect(de2.getValeur()).andReturn(3);
		EasyMock.expect(de3.getValeur()).andReturn(3);

		//Joueur 2 lance les dés parce qu'il a fait des points et obtient 2, 3 et 3 au tour 1.
		//Pas de point, le tour est fini.
		EasyMock.expect(de1.getValeur()).andReturn(2);
		EasyMock.expect(de2.getValeur()).andReturn(3);
		EasyMock.expect(de3.getValeur()).andReturn(3);
		
		//Rend les dés disponible pour utilisation.
		EasyMock.replay(de1);
		EasyMock.replay(de2);
		EasyMock.replay(de3);
		
		strategieBunco.calculerScoreTour(jeu);
		
		//Vérifie que les dés ont été appelés tel que définis.
		EasyMock.verify(de1);
		EasyMock.verify(de2);
		EasyMock.verify(de3);
		
		//Conditions de réussite.
		Assert.assertTrue(joueur1.getScore() == 0);
		Assert.assertTrue(joueur2.getScore() == 0);
	}

}
