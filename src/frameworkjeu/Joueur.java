package frameworkjeu;

public class Joueur implements Comparable<Joueur> {
	
	private String nom;
	private int score;
	
	/**
	 * Constructeur de joueur
	 * @param nomJoueur Nom du joueur
	 */
	public Joueur(String nomJoueur){
		nom = nomJoueur;
		score = 0;
	}
	
	/**
	 * Retourne le nom du joueur.
	 * @return Nom du joueur
	 */
	public String getNom(){
		return nom;
	}
	
	/**
	 * Retourne le score du joueur.
	 * @return Score du joueur
	 */
	public int getScore(){
		return score;
	}
	
	/**
	 * Augmente le score du joueur.
	 * @param scoreAAjouter Score à ajouter au joueur
	 */
	public void ajouterScore(int scoreAAjouter){
		score += scoreAAjouter;
	}
	
	/**
	 * Compare le score de 2 joueurs.
	 * @return 	1 Si le score du joueur appelant est plus élevé.
	 * 			0 Si le score des 2 joueurs sont égaux.
	 * 			-1 Si le score du joueur appelant est plus petit.
	 */
	public int compareTo(Joueur joueur) {
		int resultat;
		if(this.score > joueur.score){
			resultat = 1;
		}
		else if(this.score < joueur.score){
			resultat = -1;
		}
		else{
			resultat = 0;
		}
		return resultat;
	}

}
