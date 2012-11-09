package tests;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.*;
import static org.junit.Assert.*;
import frameworkjeu.De;

public class DeTest {

	private De de1;
	private De de2;

	@Before
	public void faireAvant(){
		ArrayList<Object> listeFaces = new ArrayList<Object>();
		Collections.addAll(listeFaces, 1,2,3,4,5,6);
		
		de1 = new De(listeFaces);
		de2 = new De(listeFaces);
	}

	@Test
	public void deInferieurTest(){
		de1.setValeur(4);
		de2.setValeur(5);
		assertTrue(de1.compareTo(de2)==-1);
	}

	@Test
	public void deSuperieurTest(){
		de1.setValeur(4);
		de2.setValeur(5);
		assertTrue(de2.compareTo(de1)==1);
	}

	@Test
	public void memeDeTest(){
		de1.setValeur(4);
		assertTrue(de1.compareTo(de1)==0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deNullTest(){
		de1.setValeur(4);
		de1.compareTo(null);
	}
}