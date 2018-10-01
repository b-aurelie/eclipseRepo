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
import model.Personne;

public class FenetreSupprimer extends JFrame implements KeyListener, ActionListener {


	private JLabel labelNom = new JLabel("nom");
	private JTextField texteNom = new JTextField();
	private JButton boutonSupprimer = new JButton("Supprimer");
	

	public FenetreSupprimer() {
		setVisible(true);
		setSize(250, 200);
		setLocationRelativeTo(null);
		setTitle("Inscription");
		setLayout(null);
		
			
		add(labelNom);
		labelNom.setBounds(20, 20, 120, 20);
		
		add(texteNom);
		texteNom.setBounds(100, 20, 120, 20);
		texteNom.addKeyListener(this);
	
		add(boutonSupprimer);
		boutonSupprimer.setEnabled(false);
		boutonSupprimer.setBounds(100, 40, 120, 20);
		boutonSupprimer.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		PersonneDaoImpl daop = new PersonneDaoImpl();
		Personne p = new Personne (texteNom.getText());
		daop.remove(p);
		JOptionPane.showMessageDialog(this,"Personne "+p.getNom()+" supprimee.");
		this.dispose();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (texteNom.getText().length()!=0) boutonSupprimer.setEnabled(true);
		else boutonSupprimer.setEnabled(false);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (texteNom.getText().length()!=0) boutonSupprimer.setEnabled(true);
		else boutonSupprimer.setEnabled(false);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (texteNom.getText().length()!=0) boutonSupprimer.setEnabled(true);
		else boutonSupprimer.setEnabled(false);
	}
}