package fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.omg.CORBA.StringHolder;

import dao.PersonneDaoImpl;
import model.Personne;

public class FenetreConsultation extends JFrame implements ActionListener{
	
	private JTextArea zoneTexte = new JTextArea("zone");
	private JButton boutonOk = new JButton("OK");
	private ArrayList<JLabel> listeLabel = new ArrayList<JLabel>();	
	private JButton[] listeModif;
	private JButton[] listeSupp;
	private int[] index;

	public FenetreConsultation(ArrayList<Personne> liste) {
		listeModif = new JButton[liste.size()];
		listeSupp = new JButton[liste.size()];
		 index = new int[liste.size()];
		
		setVisible(true);
		setSize(700,600);
		setLocationRelativeTo(null);
		setTitle("Liste des personnes");
		setLayout(null);
		int yLPosition = 20;
		int yBPosition = 20;
		int yCPosition = 20;
			
		for (Personne personne : liste) {listeLabel.add(new JLabel("NumP:"+personne.getNumP()+" Nom:"+personne.getNom()+" Prenom:"+personne.getPrenom()+" Age:"+personne.getAge()));}
			
		for (JLabel jLabel : listeLabel) {
			add(jLabel);
			jLabel.setBounds(20, yLPosition, 400, 20);
			yLPosition +=20;
		}
		
		for (int i =0;i<liste.size();i++) {
			listeModif[i]=new JButton("Modifier");
			listeSupp[i]=new JButton("Supprimer");
			index[i]=liste.get(i).getNumP();
		}
		
		for (JButton b : listeModif) {
			add(b);
			b.setVisible(true);
			b.setBounds(420, yBPosition, 120, 20);
			b.addActionListener(this);
			yBPosition +=20;
		}
		
		for (JButton c : listeSupp) {
			add(c);
			c.setVisible(true);
			c.setBounds(550, yCPosition, 120, 20);
			c.addActionListener(this);
			yCPosition +=20;
		}
		
		add(boutonOk);
		boutonOk.setEnabled(true);
		boutonOk.setBounds(270, yLPosition+20, 60, 20);
		boutonOk.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==boutonOk) {
			this.dispose();
		}
		
		for (int i =0;i<listeModif.length;i++) {
			if (listeModif[i].equals(ae.getSource())) {
				FenetreModifier fModif = new FenetreModifier(index[i]);
			}
		}
		for (int i =0;i<listeSupp.length;i++) {
			if (listeSupp[i].equals(ae.getSource())) {
				
				PersonneDaoImpl daop = new PersonneDaoImpl();
				Personne p = new Personne();
				p = daop.findById(index[i]);
				daop.remove(p);
				JOptionPane.showMessageDialog(this,"Personne "+p.getNom()+" supprimee.");
				this.dispose();
			}
		}
	
	}
}
