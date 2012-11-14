package tests;

import org.junit.*;
import org.easymock.EasyMock;

import java.util.ArrayList;
import java.util.Collections;

import frameworkjeu.CollectionDe;
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
Nom du fichier : CollectionDeTest.java
Date créé : 09-11-2012
Date dern. modif. : 13-11-2012
*******************************************************/
public class CollectionDeTest {
	
	private CollectionDe collecDe;
	private De de1;

	
	@Before
	public void faireAvant(){
		de1 = EasyMock.createMock(De.class);
	}
	
	@Test
	public void CollectionDeConstructTest(){
		collecDe = new CollectionDe();
		Assert.assertTrue(collecDe.getTaille() == 0);
	}
	
	@Test
	public void ajouterDeTest(){
		collecDe = new CollectionDe();
		for(int i=0; i<7;++i){
			collecDe.ajouterDe(de1);
		}
		Assert.assertTrue(collecDe.getTaille() == 7);
	}
	
	@Test
	public void getDeTest(){
		collecDe = new CollectionDe();
		ArrayList<Object> listeFaces = new ArrayList<Object>();
		Collections.addAll(listeFaces, 1,2,3,4,5,6);
		de1 = new De(listeFaces);
		De de2 = new De(listeFaces);
		
		collecDe.ajouterDe(de1);
		collecDe.ajouterDe(de2);
		
		De de3 = collecDe.getDe(0);
		Assert.assertTrue(de3 == de1);
	}

	
	
}
