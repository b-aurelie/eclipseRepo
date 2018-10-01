package fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.PersonneDaoImpl;

public class FenetreAuthentification extends JFrame implements KeyListener, ActionListener {

	private JLabel labelNom = new JLabel("nom");
	private JLabel labelPrenom = new JLabel("prenom");
	private JTextField texteNom = new JTextField();
	private JTextField textePrenom = new JTextField();
	private JButton boutonConnexion = new JButton("Connexion");
	private JButton boutonInscription = new JButton("Inscription");

	public FenetreAuthentification() {
		setVisible(true);
		setSize(320, 200);
		setLocationRelativeTo(null);
		setTitle("Authentification");
		setLayout(null);
		
		add(labelNom);
		labelNom.setBounds(20, 20, 120, 20);
		
		add(labelPrenom);
		labelPrenom.setBounds(20, 40, 120, 20);
		
		add(texteNom);
		texteNom.setBounds(160, 20, 120, 20);
		texteNom.addKeyListener(this);
		
		add(textePrenom);
		textePrenom.setBounds(160, 40, 120, 20);
		textePrenom.addKeyListener(this);

	
		add(boutonConnexion);
		boutonConnexion.setEnabled(false);
		boutonConnexion.setBounds(160, 80, 120, 20);
		boutonConnexion.addActionListener(this);
		
		
		add(boutonInscription);
		boutonInscription.setEnabled(false);
		boutonInscription.setBounds(20, 80, 120, 20);
		boutonInscription.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==boutonConnexion) {
			PersonneDaoImpl daop = new PersonneDaoImpl();
			if (daop.findByNomPrenom(texteNom.getText(), textePrenom.getText())==null) {
				JOptionPane.showMessageDialog(this,"Vous n'�tes pas inscrit !","Inane error",JOptionPane.ERROR_MESSAGE);
				boutonConnexion.setEnabled(false);
				
			}
			else {
				FenetreAccueil fAccueil = new FenetreAccueil(texteNom.getText(), textePrenom.getText());
				this.dispose();
			}
		}
		else if (ae.getSource()==boutonInscription) {
			FenetreAjout fAjout = new FenetreAjout(texteNom.getText(), textePrenom.getText());
			this.dispose();
		}

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (texteNom.getText().length()!=0 && textePrenom.getText().length()!=0) {
			boutonConnexion.setEnabled(true);
			boutonInscription.setEnabled(true);
		}
		else {
			boutonConnexion.setEnabled(false);
			boutonInscription.setEnabled(false);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (texteNom.getText().length()!=0 && textePrenom.getText().length()!=0) {
			boutonConnexion.setEnabled(true);
			boutonInscription.setEnabled(true);
		}
		else {
			boutonConnexion.setEnabled(false);
			boutonInscription.setEnabled(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (texteNom.getText().length()!=0 && textePrenom.getText().length()!=0) {
			boutonConnexion.setEnabled(true);
			boutonInscription.setEnabled(true);
		}
		else {
			boutonConnexion.setEnabled(false);
			boutonInscription.setEnabled(false);
		}
	}
}