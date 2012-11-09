package frameworkjeu;

public class Fabrique {
	
	private De de;
	private Joueur joueur;
	
	public De creerDe(int nbFaces){
		de = new De(nbFaces);
		return de;
	}
	
	public Joueur creerJoueur(String nom){
		joueur = new Joueur(nom);
		return joueur;
	}
	
}
