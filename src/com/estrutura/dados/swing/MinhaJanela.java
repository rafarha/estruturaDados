package com.estrutura.dados.swing;

import javax.swing.*;
import java.awt.*;

public class MinhaJanela extends JFrame {

    private JTextField field = new JTextField();

    private JLabel label = new JLabel();

    private JTextArea texto = new JTextArea();

    public MinhaJanela() {
	//Define o t�tulo da janela
	super("Meu Notepad");
	setVisible(true);
	setSize(640, 480);
	setBackground(Color.BLACK);
	field.setSize(14, 14);
	this.montaJanela();
    }

    private void montaJanela() {
	label.setName("Op��o :");
	this.getContentPane().add(label);
	this.getContentPane().add(field);

    }
}
