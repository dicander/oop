import java.awt.Graphics;

public class Star {
	private int x, y;
	private int heigth, width;

	public Star(int x, int y, int heigth, int width) {
		this.x = x;
		this.y = y;
		this.heigth = heigth;
		this.width = width;
	}

	public void paint(Graphics g) {
		// Ritar en femhörning stjärna som ryms inom kvadraten med hörn i (x,y)
		// och (x+width,y+heigth)
		g.drawLine(x + 0, y + heigth, x + width / 2, y + 0);
		g.drawLine(x + width / 2, y + 0, x + width, y + heigth);
		g.drawLine(x + width, y + heigth, x + 0, y + heigth / 3);
		g.drawLine(x + 0, y + heigth / 3, x + width, y + heigth / 3);
		g.drawLine(x + width, y + heigth / 3, x + 0, y + heigth);
	}

}