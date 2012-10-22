package frameworkjeu;

/******************************************************
Cours : LOG121
Session : A2012
Groupe : 04
Projet : Laboratoire #1
�tudiant(e)(s) : Philippe Charbonneau
				 Patrice Robitaille
				 Mathieu Battah
Code(s) perm. :  CHAP07110906
                 ROBP2002805 
                 BATM19038902 
				
Professeur : Ghizlane El boussaidi
Charg� de labo  : Alvine Boaye Belle
Nom du fichier : Iterateur.java
Date cr�� : 21-10-2012
Date dern. modif. : 18-10-2012
*******************************************************/

public interface Iterateur {
	public boolean possedeSuivant();
	public Object suivant();
	public boolean possedePrecedant();
	public Object precedant();
}
