package components;

import java.awt.Graphics2D;

/**Component.java
 * @author adris
 *
 * Component Object:
 *  Physical visible element (like a button or visual box)
 */

public abstract class Component {
	public float x;
	public float y;
	public abstract void draw(Graphics2D g);
}
