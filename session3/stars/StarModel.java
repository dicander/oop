import java.util.LinkedList;
import java.awt.Dimension;

public class StarModel {
	private int width, height;
	private LinkedList<Star> stars;

	
	/**
	 * Creates a Star Model with width and height but add no stars.
	 * @param width
	 * @param height
	 */
	public StarModel(int width, int height) {
		this.width = width;
		this.height = height;
		this.stars = new LinkedList<Star>();
	}

	public LinkedList<Star> getStars() {
		return stars;
	}

	public void addStar(Star newStar) {
		stars.add(newStar);
	}

	public Dimension getDimension() {
		return new Dimension(width, height);
	}

	public void addRandomStar() {
		int x = (int) (Math.random() * width);
		int y = (int) (Math.random() * height);
		int w = (int) (Math.random() * 100);
		Star newStar = new Star(x, y, w, w);
		stars.add(newStar);
	}

}