package decorator_pattern.basic.component;

public abstract class Beverage {
	
	public enum Size { SMALL, MEDIUM, LARGE };
	
	private Size size = Size.LARGE;
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	private String description = "unknown description";
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract double cost();
}
