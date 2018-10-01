package fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dao.PersonneDaoImpl;
import model.Personne;

public class FenetreAjout extends JFrame implements KeyListener, ActionListener {

	private JLabel labelNom = new JLabel("nom");
	private JLabel labelPrenom = new JLabel("prenom");
	private JLabel labelAge = new JLabel("age");
	private JTextField texteNom = new JTextField();
	private JTextField textePrenom = new JTextField();
	private JTextField texteAge = new JTextField();
	private JButton boutonAjout = new JButton("Inscription");
	

	public FenetreAjout(String nom, String prenom) {
		setVisible(true);
		setSize(250, 200);
		setLocationRelativeTo(null);
		setTitle("Inscription");
		setLayout(null);
		
		add(labelNom);
		labelNom.setBounds(20, 20, 120, 20);
		
		add(labelPrenom);
		labelPrenom.setBounds(20, 40, 120, 20);
		
		add(labelAge);
		labelAge.setBounds(20, 60, 120, 20);
		
		add(texteNom);
		texteNom.setBounds(100, 20, 120, 20);
		texteNom.addKeyListener(this);
		texteNom.setText(nom);
		
		add(textePrenom);
		textePrenom.setBounds(100, 40, 120, 20);
		textePrenom.addKeyListener(this);
		textePrenom.setText(prenom);
		
		add(texteAge);
		texteAge.setBounds(100, 60, 120, 20);
		texteAge.addKeyListener(this);
	
		add(boutonAjout);
		boutonAjout.setEnabled(false);
		boutonAjout.setBounds(100, 80, 120, 20);
		boutonAjout.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		PersonneDaoImpl daop = new PersonneDaoImpl();
		Personne p = new Personne (texteNom.getText(),textePrenom.getText(),texteAge.getText());
		daop.save(p);
		FenetreAccueil fenetreAccueil = new FenetreAccueil(texteNom.getText(),textePrenom.getText());
		this.dispose();

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (texteNom.getText().length()!=0 && textePrenom.getText().length()!=0 && texteAge.getText().length()!=0) boutonAjout.setEnabled(true);
		else boutonAjout.setEnabled(false);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (texteNom.getText().length()!=0 && textePrenom.getText().length()!=0 && texteAge.getText().length()!=0) boutonAjout.setEnabled(true);
		else boutonAjout.setEnabled(false);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (texteNom.getText().length()!=0 && textePrenom.getText().length()!=0 && texteAge.getText().length()!=0) boutonAjout.setEnabled(true);
		else boutonAjout.setEnabled(false);
	}
}