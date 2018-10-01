package org.eclipse.fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Fenetre2 extends JFrame implements ActionListener {
	
	private JTextField texte1 = new JTextField();
	private JButton bouton = new JButton("OK");

	public Fenetre2(String x) {
		setVisible(true);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setTitle("Fenetre2");
		setLayout(null);
		add(texte1);
		texte1.setBounds(20, 20, 120, 20);
		texte1.setText(x);
		add(bouton);
		bouton.setBounds(20, 40, 120, 20);
		bouton.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
	
}

