package tests;


import org.junit.*;

import static org.junit.Assert.*;
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
Nom du fichier : JoueurTest.java
Date créé : 09-11-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public class JoueurTest {
	
	private Joueur joueur1;
	private Joueur joueur2;

	@Before
	public void faireAvant(){
		joueur1 = new Joueur("Test1");
		joueur2 = new Joueur("Test2");
	}
	
	@Test
	public void joueurAjouterScoreTest(){
		joueur1.ajouterScore(10);
		assertTrue(joueur1.getScore()==10);
	}
	
	@Test
	public void joueurSuperieurTest(){
		joueur1.ajouterScore(3);
		joueur2.ajouterScore(2);
		assertTrue(joueur1.compareTo(joueur2)==1);
	}

	@Test
	public void joueurInferieurTest(){
		joueur1.ajouterScore(1);
		joueur2.ajouterScore(2);
		assertTrue(joueur1.compareTo(joueur2)==-1);
	}
	

	@Test
	public void joueurMemeScoreTest(){
		joueur1.ajouterScore(2);
		joueur2.ajouterScore(2);
		assertTrue(joueur1.compareTo(joueur2)==0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void joueurNullTest(){
		joueur1.ajouterScore(4);
		joueur1.compareTo(null);
	}
}
