import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal{

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control_raton aplicacion = new Control_raton();
		aplicacion.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		aplicacion.setSize(520, 200);
		aplicacion.setVisible(true);
		aplicacion.setResizable(false);

	}

}
