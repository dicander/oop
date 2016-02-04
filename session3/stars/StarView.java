import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class StarView extends JPanel {
	private StarModel myModel;

	public StarView(StarModel model) {
		this.myModel = model;
		setBackground(Color.white);
		setPreferredSize(myModel.getDimension());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Star current : myModel.getStars()) {
			current.paint(g);
		}
	}

}