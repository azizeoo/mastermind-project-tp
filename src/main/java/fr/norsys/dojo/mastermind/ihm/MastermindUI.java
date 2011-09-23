package fr.norsys.dojo.mastermind.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MastermindUI extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel container;
	private JPanel paneNord;
	private JPanel paneSud;
	private JPanel paneCentre;
	private JPanel paneEst;


	private JLabel essai1;
	private JLabel essai2;
	private JLabel essai3;
	private JLabel essai4;
	
	private JButton nouveauJeu;
	private JButton abonndonJeu;
	private JButton valider;
	
	private JButton rouge1;
	private JButton rouge2;
	private JButton rouge3;
	
	private JButton vert1;
	private JButton vert2;
	private JButton vert3;
	
	private JButton bleu1;
	private JButton bleu2;
	private JButton bleu3;
	
	private JTextField label11;
	private JTextField label12;
	private JTextField label13;
	
	




	public MastermindUI() {

		container = new JPanel();
		paneCentre = new JPanel();
		paneSud = new JPanel();
		paneEst = new JPanel();
		essai1 = new JLabel(IUtilisateurConst.ESSAI_1);
		essai2 = new JLabel(IUtilisateurConst.ESSAI_2);
		essai3 = new JLabel(IUtilisateurConst.ESSAI_3);
		essai4 = new JLabel(IUtilisateurConst.ESSAI_4);
		
		nouveauJeu = new JButton(IUtilisateurConst.JEU_NOUVEAU);
		abonndonJeu = new JButton(IUtilisateurConst.JEU_ABONNDON);
		valider = new JButton(IUtilisateurConst.VALIDER);
		
		rouge1 = new JButton();
		rouge2 = new JButton();
		rouge3 = new JButton();
		
		vert1 = new JButton();
		vert2 = new JButton();
		vert3 = new JButton();
		
		bleu1 = new JButton();
		bleu2 = new JButton();
		bleu3 = new JButton();
		
		paneNord = new JPanel();
		paneSud = new JPanel();
		

		label11 = new JTextField();
		label12 = new JTextField();
		label13 = new JTextField();
		


		paneNord.setPreferredSize(new Dimension(500, 50));
		paneNord.setBackground(Color.BLACK);

		paneCentre.setPreferredSize(new Dimension(600, 350));
		paneCentre.setBackground(Color.WHITE);
		
		essai1.setBounds(10, 10, 20, 20);
		essai2.setBounds(10, 40, 20, 20);
		essai3.setBounds(10, 70, 20, 20);
		essai4.setBounds(10, 100, 20, 20);
		
		label11.setBounds(50, 10, 20, 20);
		label12.setBounds(100, 10, 20, 20);
		label13.setBounds(150, 10, 20, 20);
		
		

		paneCentre.add(essai1);
		paneCentre.add(essai2);
		paneCentre.add(essai3);
		paneCentre.add(essai4);
		
		
		paneCentre.add(label11);
		paneCentre.add(label12);
		paneCentre.add(label13);
		

		paneEst.setPreferredSize(new Dimension(250, 350));
		paneEst.setBackground(Color.GRAY);
		paneEst.setLayout(null);
		paneEst.add(nouveauJeu);
		paneEst.add(abonndonJeu);
		paneEst.add(valider);
		paneEst.add(rouge1);
		paneEst.add(rouge2);
		paneEst.add(rouge3);
		
		paneEst.add(vert1);
		paneEst.add(vert2);
		paneEst.add(vert3);
		
		paneEst.add(bleu1);
		paneEst.add(bleu2);
		paneEst.add(bleu3);

		setTitle(IUtilisateurConst.TITRE_UTILISATEUR);
		setSize(new Dimension(600, 480));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

		container.setBackground(Color.GRAY);
		container.setLayout(new BorderLayout());
		container.add(paneCentre, BorderLayout.CENTER);
		container.add(paneSud, BorderLayout.SOUTH);
		container.add(paneNord, BorderLayout.NORTH);
		container.add(paneEst, BorderLayout.EAST);

		paneCentre.setLayout(null);

		setContentPane(container);


		valider.setBounds(20, 25, 200, 25);
		abonndonJeu.setBounds(20, 55, 200, 25);
		nouveauJeu.setBounds(20, 85, 200, 25);
		
		rouge1.setBounds(50, 150, 20, 20);
		rouge2.setBounds(100, 150, 20, 20);
		rouge3.setBounds(150, 150, 20, 20);
		rouge1.setBackground(Color.RED);
		rouge2.setBackground(Color.RED);
		rouge3.setBackground(Color.RED);
		
		vert1.setBounds(50, 200, 20, 20);
		vert2.setBounds(100, 200, 20, 20);
		vert3.setBounds(150, 200, 20, 20);
		vert1.setBackground(Color.GREEN);
		vert2.setBackground(Color.GREEN);
		vert3.setBackground(Color.GREEN);
		
		bleu1.setBounds(50, 250, 20, 20);
		bleu2.setBounds(100, 250, 20, 20);
		bleu3.setBounds(150, 250, 20, 20);
		bleu1.setBackground(Color.BLUE);
		bleu2.setBackground(Color.BLUE);
		bleu3.setBackground(Color.BLUE);
		

		valider.setActionCommand(IUtilisateurConst.VALIDER);
		nouveauJeu.setActionCommand(IUtilisateurConst.JEU_NOUVEAU);
		abonndonJeu.setActionCommand(IUtilisateurConst.JEU_ABONNDON);
		rouge1.setActionCommand(IUtilisateurConst.ROUGE_1_1);
		rouge2.setActionCommand(IUtilisateurConst.ROUGE_2_1);
		rouge3.setActionCommand(IUtilisateurConst.ROUGE_3_1);
		
		vert1.setActionCommand(IUtilisateurConst.VERT_1_2);
		vert2.setActionCommand(IUtilisateurConst.VERT_2_2);
		vert3.setActionCommand(IUtilisateurConst.VERT_3_2);
		
		bleu1.setActionCommand(IUtilisateurConst.BLEU_1_3);
		bleu2.setActionCommand(IUtilisateurConst.BLEU_2_3);
		bleu3.setActionCommand(IUtilisateurConst.BLEU_3_3);

		valider.addActionListener(this);
		nouveauJeu.addActionListener(this);
		abonndonJeu.addActionListener(this);
		
		rouge1.addActionListener(this);
		rouge2.addActionListener(this);
		rouge3.addActionListener(this);
		
		vert1.addActionListener(this);
		vert2.addActionListener(this);
		vert3.addActionListener(this);
		
		bleu1.addActionListener(this);
		bleu2.addActionListener(this);
		bleu3.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
//action pour quitter le jeux
		if (IUtilisateurConst.VALIDER == actionCommand) {
			System.exit(0);
// action pour initisalier le jeux			
		} else if (IUtilisateurConst.JEU_ABONNDON == actionCommand) {
// action pour initisalier le jeux
		} else if (IUtilisateurConst.JEU_NOUVEAU == actionCommand) {
			label11.setBackground(Color.WHITE);
			label12.setBackground(Color.WHITE);
			label13.setBackground(Color.WHITE);
			
// des actions pour modifier le choix du joueur	
			
		} else if (IUtilisateurConst.ROUGE_1_1 == actionCommand){
			label11.setBackground(Color.RED);
		} else if (IUtilisateurConst.ROUGE_2_1 == actionCommand){
			label12.setBackground(Color.RED);
		} else if (IUtilisateurConst.ROUGE_3_1 == actionCommand){
			label13.setBackground(Color.RED);
		} else if (IUtilisateurConst.VERT_1_2 == actionCommand){
			label11.setBackground(Color.GREEN);
		} else if (IUtilisateurConst.VERT_2_2 == actionCommand){
			label12.setBackground(Color.GREEN);
		} else if (IUtilisateurConst.VERT_3_2 == actionCommand){
			label13.setBackground(Color.GREEN);
		} else if (IUtilisateurConst.BLEU_1_3 == actionCommand){
			label11.setBackground(Color.BLUE);
		} else if (IUtilisateurConst.BLEU_2_3 == actionCommand){
			label12.setBackground(Color.BLUE);
		} else if (IUtilisateurConst.BLEU_3_3 == actionCommand){
			label13.setBackground(Color.BLUE);
		}
	}
	
//TODO a faire des fonction pour appeler le service master mind ainsi que le service pour stocker les résultats
//	dans la base de donnée
}
