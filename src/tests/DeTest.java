package tests;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.*;
import static org.junit.Assert.*;
import frameworkjeu.De;

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
Nom du fichier : DeTest.java
Date créé : 09-11-2012
Date dern. modif. : 11-11-2012
*******************************************************/

public class DeTest {

	private De de1;
	private De de2;
	private De de3;
	private De de4;
	private De de5;
	private De de6;
	private De de7;
	private De de8;

	@SuppressWarnings("unchecked")
	@Before
	public void faireAvant(){
		ArrayList<Object> listeFacesInt = new ArrayList<Object>();
		Collections.addAll(listeFacesInt, 1,2,3,4,5,6);
		ArrayList<Object> listeFacesBool = new ArrayList<Object>();
		Collections.addAll(listeFacesBool, true,false);
		ArrayList<Object> listeFacesString = new ArrayList<Object>();
		Collections.addAll(listeFacesString, "1","2","3","4","5","6");
		ArrayList<Object> listeFacesMelange = new ArrayList<Object>();
		Collections.addAll(listeFacesMelange, true,"2",3,"4",false,6,7,8,9,10,"allo");
		
		de1 = new De(listeFacesInt);
		de2 = new De(listeFacesInt);
		de3 = new De(listeFacesBool);
		de4 = new De(listeFacesBool);
		de5 = new De(listeFacesString);
		de6 = new De(listeFacesString);
		de7 = new De(listeFacesMelange);
		de8 = new De(listeFacesMelange);
	}

	@Test
	public void deInferieurTest(){
		de1.setValeur(4);
		de2.setValeur(5);
		de3.setValeur(true);
		de4.setValeur(false);
		de5.setValeur("1");
		de6.setValeur("4");
		de7.setValeur("2");
		de8.setValeur(false);
		assertTrue(de1.compareTo(de2)==-1);
		assertTrue(de3.compareTo(de4)==-1);
		assertTrue(de5.compareTo(de6)==-1);
		assertTrue(de7.compareTo(de8)==-1);
	}

	@Test
	public void deSuperieurTest(){
		de1.setValeur(4);
		de2.setValeur(5);
		de3.setValeur(true);
		de4.setValeur(false);
		de5.setValeur("1");
		de6.setValeur("4");
		de7.setValeur("2");
		de8.setValeur(false);
		assertTrue(de2.compareTo(de1)==1);
		assertTrue(de4.compareTo(de3)==1);
		assertTrue(de6.compareTo(de5)==1);
		assertTrue(de8.compareTo(de7)==1);
	}

	@Test
	public void memeDeTest(){
		de1.setValeur(4);
		de3.setValeur(true);
		de5.setValeur("1");
		de7.setValeur("2");
		assertTrue(de1.compareTo(de1)==0);
		assertTrue(de3.compareTo(de3)==0);
		assertTrue(de5.compareTo(de5)==0);
		assertTrue(de7.compareTo(de7)==0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deNullTest(){
		de1.setValeur(4);
		de1.compareTo(null);

	}
}