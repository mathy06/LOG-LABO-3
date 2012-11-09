package frameworkjeu;

import java.util.ArrayList;

public final class Fabrique {
	
	public static De creerDe(ArrayList listeFaces){
		return new De(listeFaces);
	}
	
	public static Joueur creerJoueur(String nom){
		return new Joueur(nom);
	}
	
}
