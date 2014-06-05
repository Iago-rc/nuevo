import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Secundario extends JDialog implements ActionListener, ItemListener {
	public JLabel lblInfo, lblTitulo, BotonIzq, BotonDer;
	public JTextField txtTitulo;
	public JComboBox combo;

	public String[] colores = { "white", "green", "blue", "pink" };
	public Color[] coloresReales = { Color.WHITE, Color.GREEN, Color.blue,
			Color.pink };
	Control_raton f = (Control_raton) this.getOwner();

	public Secundario(Control_raton control_raton) {
		super(control_raton, true);
		setLayout(new FlowLayout());
		setTitle("Ventana secundaria");
		lblInfo = new JLabel();
		add(lblInfo);
		lblTitulo = new JLabel("Introduce un titulo para el formulario");
		add(lblTitulo);
		txtTitulo = new JTextField(10);
		txtTitulo.addActionListener(this);
		add(txtTitulo);

		// combobox
		combo = new JComboBox(colores);
		combo.setMaximumRowCount(8);
		combo.setSelectedIndex(0);
		combo.setBounds(30, 30, 40, 30);
		combo.addItemListener(this);
		add(combo);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		f.tit = txtTitulo.getText();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		f.micolor1 = coloresReales[combo.getSelectedIndex()];

		f.micolor2 = coloresReales[combo.getSelectedIndex()];

	}
}