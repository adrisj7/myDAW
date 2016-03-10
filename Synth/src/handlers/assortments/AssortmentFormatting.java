package handlers.assortments;

public class AssortmentFormatting {
	
	// Just stores format variables.

	/// FORMAT TYPES:
	private static FormatType type;

	/// FORMAT VARIABLES:
	public int padding;//   px
	public int lineWidth;// px

	
	public AssortmentFormatting(FormatType type) {
		this.type = type;
		switch(type) {
			case DEFAULT:
				padding = 16;
				lineWidth = 8;
				break;
			default:
				System.err.println("INVALID FORMAT TYPE FOR ASSORTMENT FORMAT"
						+ ": " + type + ".");
				break;
		}
	}
	
	public FormatType getType() {
		return type;
	}
}
