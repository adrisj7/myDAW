package handlers.assortments;

import java.util.LinkedList;

import components.Background;
import components.Component;
import core.Core;

/**
 * These are pre-made Assortments.
 * THIS ALSO CONTROLS FORMATTING 
 */

public class AssortmentCreator {
	public static AssortmentFormatting format = 
			new AssortmentFormatting(FormatType.DEFAULT);

	public static Assortment createAssortmentBackground() {
		LinkedList<Component> list = new LinkedList<Component>();
		list.add(new Background(
				format.padding,
				format.padding,
				Core.WIDTH/2 - 2*format.padding,
				Core.HEIGHT - 2*format.padding) );
		list.add(new Background(
				Core.WIDTH/2 + format.padding,
				format.padding,
				Core.WIDTH/2 - 2*format.padding,
				Core.HEIGHT - 2*format.padding) );
		return new Assortment(0,0,list);
	}

}
