package es.studium.Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Panel botonera = new Panel();
	Panel resultado = new Panel();
	Button btnBoton1 = new Button("1");
	Button btnBoton2 = new Button("2");
	Button btnBoton3 = new Button("3");
	Button btnBotonMas = new Button("+");
	Button btnBoton4 = new Button("4");
	Button btnBoton5 = new Button("5");
	Button btnBoton6 = new Button("6");
	Button btnBotonMenos = new Button("-");
	Button btnBoton7 = new Button("7");
	Button btnBoton8 = new Button("8");
	Button btnBoton9 = new Button("9");
	Button btnBotonMul = new Button("*");
	Button btnBotonPunt = new Button(".");
	Button btnBoton0 = new Button("0");
	Button btnBotonIgual = new Button("=");
	Button btnBotonDiv = new Button("/");
	Label lblEtiqueta = new Label("Resultado: ");
	TextField txtCampo1 = new TextField(20);
	String cadena="";
	String salida="";
	int numero=0;
	
	public Calculator()
	{
		// Establecer la distribución con 4 filas y 4 columnas
		botonera.setLayout(new GridLayout(4,4));
		resultado.setLayout(new GridLayout(1,2));
		setLayout (new BorderLayout());
		setTitle("Calculator");
		botonera.add(btnBoton1);
		botonera.add(btnBoton2);
		botonera.add(btnBoton3);
		botonera.add(btnBotonMas);
		btnBotonMas.setBackground(Color.gray);
		botonera.add(btnBoton4);
		botonera.add(btnBoton5);
		botonera.add(btnBoton6);
		botonera.add(btnBotonMenos);
		btnBotonMenos.setBackground(Color.gray);
		botonera.add(btnBoton7);
		botonera.add(btnBoton8);
		botonera.add(btnBoton9);
		botonera.add(btnBotonMul);
		btnBotonMul.setBackground(Color.gray);
		botonera.add(btnBotonPunt);
		botonera.add(btnBoton0);
		botonera.add(btnBotonIgual);
		btnBotonIgual.setBackground(Color.gray);
		botonera.add(btnBotonDiv);
		btnBotonDiv.setBackground(Color.gray);
		resultado.add(lblEtiqueta);
		resultado.add(txtCampo1);
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		btnBoton3.addActionListener(this);
		btnBotonMas.addActionListener(this);
		btnBoton4.addActionListener(this);
		btnBoton5.addActionListener(this);
		btnBoton6.addActionListener(this);
		btnBotonMenos.addActionListener(this);
		btnBoton7.addActionListener(this);
		btnBoton8.addActionListener(this);
		btnBoton9.addActionListener(this);
		btnBotonMul.addActionListener(this);
		btnBotonPunt.addActionListener(this);
		btnBoton0.addActionListener(this);
		btnBotonIgual.addActionListener(this);
		btnBotonDiv.addActionListener(this);
		setSize(250,300);
		add("Center", botonera);
		add("North",resultado);
		setLocationRelativeTo(null);
		setResizable(false);
		addWindowListener(this);
		setVisible(true);
	}
	// Fin del Constructor
	public static void main(String[] args)
	{
		new Calculator();
	}
	// Fin del main
	
	
	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent Cal)
	{
		if(btnBoton1.equals(Cal.getSource()))
		{
			txtCampo1.setText("1");
		}
		else if (btnBoton2.equals(Cal.getSource()))
		{
			txtCampo1.setText("2");
		}
		else
		{
			lblEtiqueta.setText("Pruebas");
		}
		
	}
}


