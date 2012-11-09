package frameworkjeu;

public final class Fabrique {
	
	public static De creerDe(int nbFaces){
		return new De(nbFaces);
	}
	
	public static Joueur creerJoueur(String nom){
		return new Joueur(nom);
	}
	
}
