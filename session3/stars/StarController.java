import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;

public class StarController extends JPanel implements ActionListener {
	private StarModel myModel;
	private StarView myView;
	private JButton addButton = new JButton("Add random star");

	public StarController(StarModel sm, StarView sv) {
		myModel = sm;
		myView = sv;
		add(addButton);
		addButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("add");
		myModel.addRandomStar();
		myView.repaint();
	}
}