package handlers;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.LinkedList;

import components.Component;
import core.Core;

public class ObjectHandler {
	public LinkedList<Component> componentList = new LinkedList<Component>();

	public void draw(Graphics2D g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, Core.WIDTH, Core.HEIGHT);
		for(int i = 0; i < componentList.size(); i++) {
			componentList.get(i).draw(g);
		}
	}
	
	
}
