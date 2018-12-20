package com.estrutura.dados.swing;

import javax.swing.*;
import java.awt.*;

public class MinhaJanela extends JFrame {

    public void janela() {
	//Criando e setando uma nova Janela
	JFrame frame = new JFrame("Teste");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel label1 = new JLabel("Digite uma das opções acima:");
	JTextField field1 = new JTextField(15);

	//Setando o conteudo da Janela
	Container container = frame.getContentPane();
	SpringLayout springLayout = new SpringLayout();
	container.setLayout(springLayout);
	container.add(new JLabel("Label 01: "));
	container.add(new JTextField("Text Field: ", 15));
	springLayout.putConstraint(SpringLayout.HEIGHT, field1, 50, SpringLayout.HEIGHT, container);

	//Mostrar a Janela
	frame.setSize(300, 300);
	frame.pack();
	frame.setVisible(true);

    }

}
