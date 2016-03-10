package handlers.assortments;

import java.util.LinkedList;

import components.Component;
import core.Core;

/**
 * Assortment.java
 * 
 * Basically a handler that creates components based on its location.
 * 
 * 
 *
 */
public class Assortment {
	private LinkedList<Component> list = new LinkedList<Component>();

	public float x;
	public float y;
	
	public Assortment(int x, int y) {
		System.out.println("JUST A TEST: " + x + ", " + y);
		this.x = x;
		this.y = y;
	}

	public Assortment(int x, int y,Component[] initList) {
		this(x,y);
		for (int i = 0; i < initList.length; i++) {
			Component tempCmpnt = initList[i];
			tempCmpnt.x += x;
			tempCmpnt.y += y;
			addComponent(tempCmpnt);
		}
	}

	public Assortment(int x, int y, LinkedList<Component> list) {
		this(x,y);
		this.list = list;
		Core.handler.componentList.addAll(list);
	}

	public void addComponent(Component component) {
		Core.handler.addComponent(component);
		list.add(component);
	}
}
