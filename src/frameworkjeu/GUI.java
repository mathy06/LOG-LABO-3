package frameworkjeu;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import frameworkjeu.ApplicationSupport;
import frameworkjeu.GUI.CustomCanvas;

public class GUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int CANEVAS_HAUTEUR = 500;

	private static final int CANEVAS_LARGEUR = 500;
	
	private static final int MARGE_H = 50;

	private static final int MARGE_V = 60;
		
	private JLabel de1;
	
	private String[] imgDices = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg"};
	
	private Icon[]	dice = {	new ImageIcon(getClass().getResource(imgDices[0])),
								new ImageIcon(getClass().getResource(imgDices[1])),
								new ImageIcon(getClass().getResource(imgDices[2])),
								new ImageIcon(getClass().getResource(imgDices[3])),
								new ImageIcon(getClass().getResource(imgDices[4])),
								new ImageIcon(getClass().getResource(imgDices[5]))
							};
	
	/**
	 * Constructeur - Créer le cadre du jeu 
	 */
	public GUI() {
		getContentPane().add(new JScrollPane(new CustomCanvas()));
	}
	
	private JLabel afficherDe() {

		de1 = new JLabel();
		de1.setAlignmentX(100);
		de1.setIcon(dice[0]);
		de1.setSize(300, 300);
		return de1;
	}
	
	/* Lancer l'exécution de l'application. */
	public static void main(String[] args) {
		/* Créer la fenêtre de l'application. */
		GUI cadre = new GUI();
		//cadre.setBackground(new Color(0,115,0));
		
		
		/* On récupère la dimension de l'écran pour centrer. */	
		Point centre = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		
		
		
		JLabel Joueur1Label = new JLabel("Patrice");
		Joueur1Label.setForeground(Color.WHITE);
		Joueur1Label.setAlignmentX(centre.x - (CANEVAS_LARGEUR / 2));
		Joueur1Label.setSize(100, 20);
		
		JPanel p = new JPanel();
		p.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		JPanel gp = new JPanel();
		gp.setBackground(new Color(0,115,0));
		
		cadre.add(Joueur1Label);
		cadre.add(cadre.afficherDe());
		cadre.add(gp);
		
		
	
		
		/* Lancer l'application. */
		ApplicationSupport.launch(cadre, "Titre", (centre.x - (CANEVAS_LARGEUR / 2)), (centre.y - (CANEVAS_HAUTEUR / 2)), CANEVAS_LARGEUR
				+ MARGE_H, CANEVAS_HAUTEUR + MARGE_V);
		
		
		
	}
	
	

	/**
	 *  Créer le panneau du jeu
	 */
	class CustomCanvas extends JPanel {
		private static final long serialVersionUID = 1L;

		public CustomCanvas() {
			setSize(getPreferredSize());
			setMinimumSize(getPreferredSize());
			CustomCanvas.this.setBackground(new Color(0,115,0));
		}

		public Dimension getPreferredSize() {
			return new Dimension(CANEVAS_LARGEUR, CANEVAS_HAUTEUR);
		}

		public void paintComponent(Graphics graphics) {
			super.paintComponent(graphics);
			Graphics2D g2d = (Graphics2D) graphics;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);

		}
	}
}
