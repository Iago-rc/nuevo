import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Control_raton extends JFrame implements MouseListener,
		MouseMotionListener, KeyListener, ItemListener {
	public JButton btn1, btn2;
	public JLabel etiq;
	public Color micolor1 = Color.red, micolor2 = Color.BLACK;
	public String tit="Control de Raton", hola;

	public Control_raton() {
		super("Control de ratón");
		this.setLayout(null);
		this.getContentPane().addMouseMotionListener(this);
		this.getContentPane().addMouseListener(this);
		setFocusable(true);

		// Etiqueta
		etiq = new JLabel("Teclas");
		etiq.setBounds(10, 50, 250, 20);
		//ESTO ES UN CAMBIO
		//Esto es un cambio en nueva_rama
		
		this.add(etiq);

		// btn1
		btn1 = new JButton();
		btn1.setBounds(100, 15, 100, 25);
		btn1.addMouseMotionListener(this);
		btn1.addMouseListener(this);
		btn1.addKeyListener(this);
		this.add(btn1);

		// btn2
		btn2 = new JButton();
		btn2.setBounds(200, 15, 100, 25);
		btn2.addMouseMotionListener(this);
		btn2.addMouseListener(this);
		btn2.addKeyListener(this);
		this.add(btn2);

		this.addKeyListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				int res = JOptionPane
						.showConfirmDialog(null, "Deseas cerrar el programa?",
								"Eventos Teclado", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);
				if (res == JOptionPane.OK_OPTION)
					e.getWindow().dispose();
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setTitle(tit);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {

			btn1.setBackground(micolor1);
		}

		if (e.getButton() == MouseEvent.BUTTON3) {

			btn2.setBackground(micolor2);
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == 1) {

			btn1.setBackground(null);
		}

		if (e.getButton() == 3) {

			btn2.setBackground(null);
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		setTitle(String.format(tit+"-(X:%d, Y:%d)", e.getX(),
				e.getY()));
		//((JButton)e.getSource()).getX()
		if(e.getSource()==btn1){
			setTitle(String.format(tit+"-(X:%d, Y:%d)", e.getX()+100,
					e.getY()+15));
		}
		if(e.getSource()==btn2){
			setTitle(String.format(tit+"-(X:%d, Y:%d)", e.getX()+200,
					e.getY()+15));
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		etiq.setText(String.format("Tecla Pulsada " + e.getKeyCode() + ","
				+ e.getKeyChar()));
		if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_C) {
			Secundario f = new Secundario(this);
			f.pack(); // Tamaño necesario para ver todos los componentes
			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			f.setVisible(true);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

}
