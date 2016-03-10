package components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Background extends Component {

	private Dimension dimension;
	private Rectangle rect;// TEMPORARY

	public Background(int x, int y, Dimension dimension) {
		this.x = x;
		this.y = y;
		this.dimension = dimension;
		init();
	}

	public Background(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		dimension = new Dimension(width, height);
		init();
	}
	
	private void init() {
		rect = new Rectangle((int)x, (int)y, (int)dimension.getWidth(), (int)dimension.getHeight());
	}

	public void draw(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fill(rect);
		g.setColor(Color.GREEN);
		g.draw(rect);
	}

}
