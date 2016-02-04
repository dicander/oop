import javax.swing.JFrame;

public class StarFrame extends JFrame {

	public StarFrame() {
		super("Star");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		StarModel model = new StarModel(500, 500);
		StarView view = new StarView(model);
		StarController controller = new StarController(model, view);
		add(controller, "West");
		add(view, "Center");
		pack();
	}

	public static void main(String[] args) {
		StarFrame sf = new StarFrame();
	}

}