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
/**
 * 
 * @author Anka Motz
 * @version 1-2021
 *
 */
public class Calculator extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Panel botonera = new Panel();
	Panel resultado = new Panel();
	//Añado nuevo panel borrado para meter todos los componentes del botón AC
	Panel borrado = new Panel();
	Button btnAc = new Button ("AC");
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
	int operacion=0;
	float numero1=0.0f;
	float numero2=0.0f;
		
	public Calculator()
	{
		// Establecer la distribuci�n con 4 filas y 4 columnas
		botonera.setLayout(new GridLayout(4,4));
		resultado.setLayout(new GridLayout(1,2));
		//He añadido otro panel para el boton de borrar
		borrado.setLayout(new GridLayout(1,1));
		
		setLayout (new BorderLayout());
		setTitle("Calculator");
		//añado el boton AC
		borrado.add(btnAc);
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
		//Action listener para el último botón
		btnAc.addActionListener(this);
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
		//Lo añado al panel en la posiión norte
		add("North", borrado);
		add("Center", botonera);
		add("South",resultado);
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
		//Refactorizado de la salida con un syso
		Salida();
		System.exit(0);
	}
	public void Salida() {
		System.out.println("Dale a las Xx de la consola");
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
	
	public void actionPerformed(ActionEvent Cal)
	{	
		float resultado=0;
		 if(btnBoton1.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"1");
			
		}
		else if (btnBoton2.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"2");
		}
		else if (btnBoton3.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"3");
		}
		else if (btnBotonMas.equals(Cal.getSource()))
			{
			operacion=0;
			numero1=(Float.parseFloat(txtCampo1.getText()));
			txtCampo1.setText("");
			}
		else if (btnBoton4.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"4");
		}
		else if (btnBoton5.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"5");
		}
		else if (btnBoton6.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"6");
		}
		else if (btnBotonMenos.equals(Cal.getSource()))
		{
			operacion=1;
			numero1=(Float.parseFloat(txtCampo1.getText()));
			txtCampo1.setText("");
		}
		else if (btnBoton7.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"7");
		}
		else if (btnBoton8.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"8");
		}
		else if (btnBoton9.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"9");
		}
		else if (btnBotonMul.equals(Cal.getSource()))
		{
			operacion=2;
			numero1=(Float.parseFloat(txtCampo1.getText()));
			txtCampo1.setText("");
		}
		else if (btnBotonPunt.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText());
		}
		else if (btnBotonDiv.equals(Cal.getSource()))
		{
			operacion=3;
			numero1=(Float.parseFloat(txtCampo1.getText()));
			txtCampo1.setText("");
		}
		else if (btnBotonIgual.equals(Cal.getSource()))
		{
			numero2=(Float.parseFloat(txtCampo1.getText()));
			switch(operacion)
			{
			case 0:
				resultado=numero1+numero2;
				txtCampo1.setText(Float.toString(resultado));
				break;
			case 1:
				resultado=numero1-numero2;
				txtCampo1.setText(Float.toString(resultado));
				break;
			case 2:
				resultado=numero1*numero2;
				txtCampo1.setText(Float.toString(resultado));
				break;
			case 3:
				resultado=numero1/numero2;
				txtCampo1.setText(Float.toString(resultado));
				break;
			}
						
		}
		else if (btnBoton0.equals(Cal.getSource()))
		{
			txtCampo1.setText(txtCampo1.getText()+"0");
		}
		else if(Cal.getSource().equals(btnAc))
		{//cadena vacia para que borre
			txtCampo1.setText("");
		}
		else
		{
			lblEtiqueta.setText("Pruebas");
		}
		
	}
}


