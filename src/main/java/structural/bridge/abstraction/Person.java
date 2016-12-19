package structural.bridge.abstraction;

import structural.bridge.implementor.Clothing;

public abstract class Person {
	private Clothing clothing;

	private String type;

	public Clothing getClothing() {
		return clothing;
	}

	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public abstract void dress();
}
