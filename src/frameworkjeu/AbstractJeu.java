package frameworkjeu;

public abstract class AbstractJeu {
	
	public void initialiserJeu(){}
	
	final void jouerPartie(){
		/* contient l'ordre d'appel des autres fonctions pour jouer au jeu. */
	}
	
	public void calculerScoreJoueur(){}
	
	public void calculerScoreDe(){}
	
	public void comparerScoreJoueur(){}
	
	public void partieTerminee(){}

}
