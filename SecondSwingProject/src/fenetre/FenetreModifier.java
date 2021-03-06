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

public class FenetreModifier extends JFrame implements KeyListener, ActionListener {

	private JLabel labelNumP = new JLabel("numP");
	private JLabel labelNom = new JLabel("nom");
	private JLabel labelPrenom = new JLabel("prenom");
	private JLabel labelAge = new JLabel("age");
	private JTextField texteNumP = new JTextField();
	private JTextField texteNom = new JTextField();
	private JTextField textePrenom = new JTextField();
	private JTextField texteAge = new JTextField();
	private JButton boutonModifier = new JButton("Modifier");
	

	public FenetreModifier() {
		setVisible(true);
		setSize(250, 200);
		setLocationRelativeTo(null);
		setTitle("Inscription");
		setLayout(null);
		
		add(labelNumP);
		labelNumP.setBounds(20, 20, 120, 20);
		
		add(labelNom);
		labelNom.setBounds(20, 40, 120, 20);
		
		add(labelPrenom);
		labelPrenom.setBounds(20, 60, 120, 20);
		
		add(labelAge);
		labelAge.setBounds(20, 80, 120, 20);
		
		add(texteNumP);
		texteNumP.setBounds(100, 20, 120, 20);
		texteNumP.addKeyListener(this);
		
		add(texteNom);
		texteNom.setBounds(100, 40, 120, 20);
		texteNom.addKeyListener(this);
				
		add(textePrenom);
		textePrenom.setBounds(100, 60, 120, 20);
		textePrenom.addKeyListener(this);
				
		add(texteAge);
		texteAge.setBounds(100, 80, 120, 20);
		texteAge.addKeyListener(this);
	
		add(boutonModifier);
		boutonModifier.setEnabled(false);
		boutonModifier.setBounds(100, 100, 120, 20);
		boutonModifier.addActionListener(this);
}
	
	public FenetreModifier(int id) {
		setVisible(true);
		setSize(250, 200);
		setLocationRelativeTo(null);
		setTitle("Inscription");
		setLayout(null);
		
		add(labelNumP);
		labelNumP.setBounds(20, 20, 120, 20);
		
		add(labelNom);
		labelNom.setBounds(20, 40, 120, 20);
		
		add(labelPrenom);
		labelPrenom.setBounds(20, 60, 120, 20);
		
		add(labelAge);
		labelAge.setBounds(20, 80, 120, 20);
		
		add(texteNumP);
		texteNumP.setBounds(100, 20, 120, 20);
		texteNumP.addKeyListener(this);
		texteNumP.setText(Integer.toString(id));
		
		add(texteNom);
		texteNom.setBounds(100, 40, 120, 20);
		texteNom.addKeyListener(this);
				
		add(textePrenom);
		textePrenom.setBounds(100, 60, 120, 20);
		textePrenom.addKeyListener(this);
				
		add(texteAge);
		texteAge.setBounds(100, 80, 120, 20);
		texteAge.addKeyListener(this);
	
		add(boutonModifier);
		boutonModifier.setEnabled(false);
		boutonModifier.setBounds(100, 100, 120, 20);
		boutonModifier.addActionListener(this);
}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		PersonneDaoImpl daop = new PersonneDaoImpl();
		Personne p = new Personne (Integer.parseInt(texteNumP.getText()),texteNom.getText(),textePrenom.getText(),texteAge.getText());
		daop.update(p);
		JOptionPane.showMessageDialog(this,"Personne ID "+p.getNumP()+" modifiee.");
		this.dispose();

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (texteNumP.getText().length()!=0 && texteNom.getText().length()!=0 && textePrenom.getText().length()!=0 && texteAge.getText().length()!=0) boutonModifier.setEnabled(true);
		else boutonModifier.setEnabled(false);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (texteNumP.getText().length()!=0 && texteNom.getText().length()!=0 && textePrenom.getText().length()!=0 && texteAge.getText().length()!=0) boutonModifier.setEnabled(true);
		else boutonModifier.setEnabled(false);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (texteNumP.getText().length()!=0 && texteNom.getText().length()!=0 && textePrenom.getText().length()!=0 && texteAge.getText().length()!=0) boutonModifier.setEnabled(true);
		else boutonModifier.setEnabled(false);
	}
}