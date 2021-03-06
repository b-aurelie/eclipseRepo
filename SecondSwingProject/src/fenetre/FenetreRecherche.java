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

public class FenetreRecherche extends JFrame implements KeyListener, ActionListener {

	private JLabel labelNumP = new JLabel("numP");
	private JTextField texteNumP = new JTextField();

	private JButton boutonRecherche = new JButton("Recherche");

	public FenetreRecherche() {
		setVisible(true);
		setSize(250, 200);
		setLocationRelativeTo(null);
		setTitle("Fenetre");
		setLayout(null);
		
				
		add(labelNumP);
		labelNumP.setBounds(20, 20, 120, 20);
		
		add(texteNumP);
		texteNumP.setBounds(100, 20, 120, 20);
		texteNumP.addKeyListener(this);
		
		add(boutonRecherche);
		boutonRecherche.setEnabled(false);
		boutonRecherche.setBounds(100, 40, 120, 20);
		boutonRecherche.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		PersonneDaoImpl daop = new PersonneDaoImpl();
		Personne pRes = daop.findById(Integer.parseInt(texteNumP.getText()));
		JOptionPane.showMessageDialog(this,pRes);
		this.dispose();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (texteNumP.getText().length()!=0) boutonRecherche.setEnabled(true);
		else boutonRecherche.setEnabled(false);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (texteNumP.getText().length()!=0) boutonRecherche.setEnabled(true);
		else boutonRecherche.setEnabled(false);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (texteNumP.getText().length()!=0) boutonRecherche.setEnabled(true);
		else boutonRecherche.setEnabled(false);
	}
}