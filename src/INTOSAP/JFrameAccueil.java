package INTOSAP;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class JFrameAccueil  extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFrameAccueil(){
		super();
		build(); // Initialisation de la fenêtre
	}
	
	private void build(){
		// Fenêtre JFrame
		this.setTitle("Choisissez la typologie"); //On donne un titre à l'application
		this.setSize(300,350); //On donne une taille à notre fenêtre
		this.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		this.setResizable(true); //On autorise la redimensionnement de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		this.setLayout(new BorderLayout());
		JLabel label_titre = new JLabel("Bienvenue sur l'IntoSAP");
		label_titre.setHorizontalAlignment(JLabel.CENTER);
		label_titre.setVerticalAlignment(JLabel.CENTER);
		this.add(label_titre, BorderLayout.PAGE_START);
		this.add(buildContentPane(), BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setBackground (Color.white);
		//Définition du layout manager
		panel.setLayout(new GridBagLayout());
		
		// Définition de l'objet servant à positionner les composants
		GridBagConstraints gbc = new GridBagConstraints();
		DefaultListModel list_donnee = new DefaultListModel();
		DefaultListModel list_objet = new DefaultListModel();
		
		//------------------------------------
		// Initialisation de la case de départ
		gbc.gridx = gbc.gridy = 0;	    	
		//------------------------------------
		// Typologie
		//------------------------------------
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = gbc.gridwidth = 1;
	    
		//TitledBorder titre;
		JLabel label_typologie = new JLabel("Typologie Test VGA");
		panel.add(label_typologie,gbc);		
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1; 
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	    ListeDeroulante listeTypologie = new ListeDeroulante("FID Source");
		
		panel.add(listeTypologie,gbc);	
		//----------------------------------
		// Objet
		//------------------------------------
		gbc.gridy = 3;		
		gbc.gridx = 0;
		JLabel label_objet = new JLabel("Objet");
		panel.add(label_objet,gbc);

		return panel;
	}
}
