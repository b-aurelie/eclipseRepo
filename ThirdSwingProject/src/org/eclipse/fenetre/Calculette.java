package org.eclipse.fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.server.Operation;

import javax.swing.JButton ;
import javax.swing.JFrame ;
import javax.swing.JTextField ;

public class Calculette extends JFrame implements ActionListener {
	
	JTextField text = new JTextField () ;
	JButton but1 = new JButton ( " 1 " ) ;
	JButton but2 = new JButton ( " 2 " ) ;
	JButton but3 = new JButton ( " 3 " ) ;
	JButton but4 = new JButton ( " 4 " ) ;
	JButton but5 = new JButton ( " 5 " ) ;
	JButton but6 = new JButton ( " 6 " ) ;
	JButton but7 = new JButton ( " 7 " ) ;
	JButton but8 = new JButton ( " 8 " ) ;
	JButton but9 = new JButton ( " 9 " ) ;
	JButton but0 = new JButton ( " 0 " ) ;
	JButton plus = new JButton ( " + " ) ;
	JButton moins = new JButton ( " -" ) ;
	JButton fois = new JButton ( " * " ) ;
	JButton div = new JButton ( " / " ) ;
	JButton point = new JButton ( " ," ) ;
	JButton clean = new JButton ( " C " ) ;
	JButton egal = new JButton ( " = " ) ;
	String texte = "";
	Object operateur = "";
	float val1 = 0;
	float val2 = 0;
	float result = 0;
	
	public void afficherCalculette () {
	
		text.setBounds (20 , 20 , 230 , 50) ;
		but1.setBounds (20 , 80 , 50 , 50) ;
		but2.setBounds (80 , 80 , 50 , 50) ;
		but3.setBounds (140 , 80 , 50 , 50) ;
		div.setBounds (200 , 80 , 50 , 50) ;
		but4.setBounds (20 , 140 , 50 , 50) ;
		but5.setBounds (80 , 140 , 50 , 50) ;
		but6.setBounds (140 , 140 , 50 , 50) ;
		plus.setBounds (200 , 140 , 50 , 50) ;
		but7.setBounds (20 , 200 , 50 , 50) ;
		but8.setBounds (80 , 200 , 50 , 50) ;
		but9.setBounds (140 , 200 , 50 , 50) ;
		moins.setBounds (200 , 200 , 50 , 50) ;
		clean.setBounds (20 , 260 , 50 , 50) ;
		but0.setBounds (80 , 260 , 50 , 50) ;
		point.setBounds (140 , 260 , 50 , 50) ;
		fois.setBounds (200 ,260 , 50 , 50) ;
		egal.setBounds (20 , 320 , 230 , 50) ;
		
		this . setLayout ( null ) ;
		this . add ( but1 ) ;
		this . add ( but2 ) ;
		this . add ( but3 ) ;
		this . add ( but4 ) ;
		this . add ( but5 ) ;
		this . add ( but6 ) ;
		this . add ( but7 ) ;
		this . add ( but8 ) ;
		this . add ( but9 ) ;
		this . add ( but0 ) ;
		this . add ( clean ) ;
		this . add ( plus ) ;
		this . add ( moins ) ;
		this . add ( fois ) ;
		this . add ( div ) ;
		this . add ( text ) ;
		this . add ( point ) ;
		this . add ( egal ) ;
		this . setVisible ( true ) ;
		this . setSize (290 , 460) ;
		this . setTitle ( " Calculatrice " ) ;
		this . setLocationRelativeTo ( null ) ;
		
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		div.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		plus.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
		moins.addActionListener(this);
		clean.addActionListener(this);
		but0.addActionListener(this);
		point.addActionListener(this);
		fois.addActionListener(this);
		egal.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==but1) {texte += "1";}
		else if (e.getSource()==but2) {texte += "2";}
		else if (e.getSource()==but3) {texte += "3";}
		else if (e.getSource()==but4) {texte += "4";}
		else if (e.getSource()==but5) {texte += "5";}
		else if (e.getSource()==but6) {texte += "6";}
		else if (e.getSource()==but7) {texte += "7";}
		else if (e.getSource()==but8) {texte += "8";}
		else if (e.getSource()==but9) {texte += "9";}
		else if (e.getSource()==but0) {texte += "0";}
		else if (e.getSource()==point) {texte += ",";}
		else if (e.getSource()==clean) {
			texte = "";
			result = 0;
			val1 = 0;
			val2 = 0;
		}
		else if ((e.getSource()==plus)||(e.getSource()==moins)||(e.getSource()==div)||(e.getSource()==fois)) {
			if (val1 == 0) {		
				val1 = Float.parseFloat(texte);
				operateur = e.getSource();
				texte = "";
			}
			else {
				val2 = Float.parseFloat(texte);
				if (operateur==plus) {
					val1 = val1+val2;
				}
				else if (operateur==moins) {
					val1 = val1-val2;
				}
				else if (operateur==div) {
					val1 = val1/val2;
				}
				else if (operateur==fois) {
					val1 = val1*val2;
				}
				operateur = e.getSource();
				texte = "";				
			}
		}
		else if (e.getSource()==egal) {
				val2 = Float.parseFloat(texte);
				if (operateur==plus) {
					result = val1+val2;
					texte = Float.toString(result);
				}
				else if (operateur==moins) {
					result = val1-val2;
					texte = Float.toString(result);
				}
				else if (operateur==div) {
					result = val1/val2;
					texte = Float.toString(result);
				}
				else if (operateur==fois) {
					result = val1*val2;
					texte = Float.toString(result);
				}
		}
		text.setText(texte);

		
		
	}
	
	
}
